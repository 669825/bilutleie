import java.util.List;

public class Utleieselskap {

    private String navn;
    private int telefon;
    private Adresse firmaAdresse;
    private List<Utleiekontor> kontorer;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public Adresse getFirmaAdresse() {
        return firmaAdresse;
    }

    public void setFirmaAdresse(Adresse firmaAdresse) {
        this.firmaAdresse = firmaAdresse;
    }

    public List<Utleiekontor> getKontorer() {
        return kontorer;
    }

    public void setKontorer(List<Utleiekontor> kontorer) {
        this.kontorer = kontorer;
    }


}//end BilutleieSelskap
