import java.time.LocalDateTime;
import java.util.Date;

public class Reservasjon {

    private Utleiekontor utleiested;
    private Kunde kunde;
    private Bil bil;

    //start av leietiden
    private LocalDateTime tidspunkt;
    private LocalDateTime tidspunktretur;
    private Utleiekontor retursted;


    /**
     * Oppretter en reservasjon med data/info fra parameterne,
     * når utleie registreres vil reservasjonn tatt utgangspunkt i, ved utleie
     * @param utleieSted
     * @param kunde
     * @param bil
     * @param tidspunkt
     * @param returSted
     */
    public Reservasjon(Utleiekontor utleieSted,Kunde kunde, Bil bil,
                       LocalDateTime tidspunkt,Utleiekontor returSted) {
        this.utleiested = utleiested;
        this.kunde = kunde;
        this.bil = bil;
        this.tidspunkt = tidspunkt;
        this.retursted = returSted;
    }

    public Utleiekontor getUtleieSted() {
        return utleiested;
    }

    public void setUtleieSted(Utleiekontor utleieSted) {
        this.utleiested = utleieSted;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        this.bil = bil;
    }

    public Utleiekontor getReturSted() {
        return retursted;
    }

    public void setReturSted(Utleiekontor returSted) {
        this.retursted = returSted;
    }

    public LocalDateTime getTidspunkt() {
        return tidspunkt;
    }

    /**
     * skriver ut info reservasjon inneholder
     * @return
     */
    @Override
    public String toString() {
        return "Reservasjon{" +
                "utleiested=" + utleiested +
                ", kunde=" + kunde +
                ", bil=" + bil +
                ", tidspunkt=" + tidspunkt +
                ", retursted=" + retursted +
                '}';
    }

    public void setTidspunkt(LocalDateTime tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public LocalDateTime getTidspunktretur() {
        return tidspunktretur;
    }

    public void setTidspunktretur(LocalDateTime tidspunktretur) {
        this.tidspunktretur = tidspunktretur;
    }
}//end Reservasjon
