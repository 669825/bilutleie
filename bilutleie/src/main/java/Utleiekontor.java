import java.util.List;

public class Utleiekontor {

    private int kontorNr;
    private Adresse utleieAdresse;
    private int telefon;

    List<Bil> biler;

    public Utleiekontor(int kontorNr, Adresse utleieAdresse, int telefon) {
        this.kontorNr = kontorNr;
        this.utleieAdresse = utleieAdresse;
        this.telefon = telefon;
    }

    public int getKontorNr() {
        return kontorNr;
    }

    public void setKontorNr(int kontorNr) {
        this.kontorNr = kontorNr;
    }

    public Adresse getUtleieAdresse() {
        return utleieAdresse;
    }

    public void setUtleieAdresse(Adresse utleieAdresse) {
        this.utleieAdresse = utleieAdresse;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public List<Bil> getBiler() {
        return biler;
    }

    public void setBiler(List<Bil> biler) {
        this.biler = biler;
    }

    @Override
    public String toString() {
        return "Utleiekontor{" +
                "kontorNr=" + kontorNr +
                ", utleieAdresse=" + utleieAdresse +
                ", telefon=" + telefon +
                '}';
    }
}//end Utleiekontor
