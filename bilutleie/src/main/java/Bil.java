public class Bil {

    private String regNr;

    private UtleieGr klasse;
    private String modell;
    private Farge farge;
    private long kmStand;
    private boolean ledig;
    private int dagspris;
    private Utleiekontor plassering;

    public Bil(String regNr, UtleieGr klasse, String modell, Farge farge,
               long kmStand, boolean ledig, int dagspris,
               Utleiekontor plassering) {

        this.regNr = regNr;
        this.klasse = klasse;
        this.modell = modell;
        this.farge = farge;
        this.kmStand = kmStand;
        this.ledig = ledig;
        this.dagspris = dagspris;
        this.plassering = plassering;
    }

    /**
     * henter fast dagspris bestemt av kjøretøy-klasse
     * @param bil
     * @return
     */
    public int hentDagspris(Bil bil){
        klasse = bil.getklasse();
        switch (klasse) {
            case A:
                return 300;
            case B:
                return 500;
            case C:
                return 700;
            case D:
                return 900;
            default:
                return 0;
        }
    }

    /**
    henter ut fast gebyr til oppgitt Kjøretøy-klasse:
    @param klasse
     */
    public int hentGebyr(UtleieGr klasse){
        switch (klasse) {
            case A:
                return 300;
            case B:
                return 500;
            case C:
                return 650;
            case D:
                return 1000;
            default:
                return 0;
        }
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public Farge getFarge() {
        return farge;
    }

    public void setFarge(Farge farge) {
        this.farge = farge;
    }

    public UtleieGr getklasse() {
        return klasse;
    }

    public void setUtleieGr(UtleieGr klasse) {
        this.klasse = klasse;
    }

    public long getKmStand() {return kmStand;
    }

    public void setKmStand(long kmStand) {this.kmStand = kmStand;
    }
    public boolean isLedig() {
        return ledig;
    }

    public void setLedig(boolean ledig) {
        this.ledig = ledig;
    }

    public int getDagspris() {
        return dagspris;
    }

    public void setDagspris(int dagspris) {
        this.dagspris = dagspris;
    }

    public Utleiekontor getPlassering() {
        return plassering;
    }

    public void setPlassering(Utleiekontor plassering) {
        this.plassering = plassering;
    }

    /**
     * Skriver ut info om bil
     * @return
     */
    @Override
    public String toString() {
        return "Bil{" +
                "regNr='" + regNr + '\'' +
                ", klasse=" + klasse +
                ", modell='" + modell + '\'' +
                ", farge='" + farge + '\'' +
                ", kmStand=" + kmStand +
                ", ledig=" + ledig +
                ", dagspris=" + dagspris +
                ", Befinner seg ved: =" + plassering.toString() +
                '}';
    }
}//end Bil
