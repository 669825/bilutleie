import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

/**
 *Utleie-klassen registrerer utleie av bil med relevant info oppgitt.
 * I tillegg har klassen en del hjelpemetoder som:
 * tid() -> beregning av antall dager bilen er leid
 * leverInn() -> innlevering av bil og beregning av kostnader
 * beregnKm() -> beregner km kjørt, dersom man ønsker å registrere kostnader for dette
 */
public class Utleie {

    private Reservasjon res;

    private int kredittkort;

    /**
     * ekstra datavariabel for faktisk tid bil bl levert inn
     * kan evnt. brukes til å bregne ekstra gebyr om bil blir
     * levert utover det oppgitt i reservasjonen
     */
    private LocalDateTime reelretur;


    /**
     * Oppretter en utleie basert på reservasjon gjort i forkant
     * @param kredittkort
     * @param res
     */
    public Utleie(Reservasjon res, int kredittkort) {
        this.kredittkort = kredittkort;
        this.res = res;
    }

    /**
     * leverer inn bil, sjekker om levert inn til ulik Utleiekontor
     * i så tilfelle beregner gebyr for dette -> oppdaterer adresse bil står på
     * @param utleie
     * @param kontor
     * @Return kostnad , beregnet dagspris + evnt. gebyr
     * oppdaterer at bil er ledig(true)
     */
    public long leverInn(LocalDateTime innTid, Utleie utleie,Utleiekontor kontor){
        int gebyr = 0;

        Bil bil = utleie.res.getBil();
        //sjekk om bil er levert inn på et annet kontor enn den var hentet
        if(bil.getPlassering().getUtleieAdresse() != kontor.getUtleieAdresse()){
            gebyr = bil.hentGebyr(bil.getklasse());
            bil.setPlassering(kontor);
        }
        //sjekker om bil ble levert inn til avtalt tidspunkt
        if(utleie.res.getTidspunktretur().compareTo(innTid) < 1){
            System.out.println("bilen ble levert inn senere enn avtalt, påfølgende gebyr vil derfor påløpe");
            //evnt. implementasjoner av gebyr beregnet etter antall timer overtid
        }
       long dager = tid(utleie,innTid);
        //beregner dagspris
        long kostnad = dager*bil.hentDagspris(bil) + gebyr;
        bil.setLedig(true);
        return kostnad;
    }



    /**
    sjekker antall dager bilen har vært leid ut ved innlevering
    @param utleie
    @Return timer overtid
     */
    public long tid(Utleie utleie,LocalDateTime reelretur) {
        Duration d = Duration.between(utleie.res.getTidspunkt(), reelretur);
        return d.toDays();
    }

    /**
     * beregner km bilen har kjørt i leietiden
     * kan evnt. brukes til å legge på km-tillegg om ønskelig
     * @param nyKm
     * @return
     */
    public long beregnKm(Utleie utleie, long nyKm){
        long kmstand = utleie.res.getBil().getKmStand();

        if(nyKm < kmstand){
            return 0;
        }
        utleie.res.getBil().setKmStand(nyKm);
        return nyKm - kmstand;
    }



    public int getKredittkort() {
        return kredittkort;
    }

    public void setKredittkort(int kredittkort) {
        this.kredittkort = kredittkort;
    }

    public LocalDateTime getReelretur() {
        return reelretur;
    }

    public void setReelretur(LocalDateTime reelretur) {
        this.reelretur = reelretur;
    }
}//end Utleie
