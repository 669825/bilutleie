public class Adresse {

    private String gatenavn;
    private int postNr;
    private String postSted;

    /**
    konstruktør for å opprette adresse
    brukt av Bil,Utleieselskap,Kunde,Utleiekontor
     */

    public Adresse(String gatenavn, int postNr,String postSted){
        this.gatenavn = gatenavn;
        this.postNr = postNr;
        this.postSted = postSted;
    }








}
