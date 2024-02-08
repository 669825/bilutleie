import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main klassen starter simulasjon av bilutleie
 * consol tar input fra bruker, validerer, og evnt. gir tilbakemeldinger
 * når kunden registrerer innlevering av bil, mottar kunden
 * bekreftselse og faktura for leien
 */

public class Main {

    List<Bil> biler = new ArrayList<>();
    List<Utleiekontor> kontorer = new ArrayList<>();
    Scanner scan = new Scanner();


    public static void main(String[] args) {



        Adresse a1 = new Adresse("Storgata", 5000, "Bergen");
        Adresse a2 = new Adresse("Prinsens gate", 7011, "Trondheim");

        Utleiekontor k1 = new Utleiekontor(1, a1, 15743737);
        Utleiekontor k2 = new Utleiekontor(2, a2, 13764289);

        kontorer.add(k1);
        kontorer.add(k2);

        biler.add(new Bil("AB12345", UtleieGr.A, "Toyota Yaris", Farge.BLÅ, 50000, true, 300, k1));
        biler.add(new Bil("CD67890", UtleieGr.B, "Volkswagen Golf", Farge.RØD, 25000, true, 500, k1));
        biler.add(new Bil("EF12345", UtleieGr.C, "Audi A3", Farge.SVART, 12000, false, 700, k2));
        biler.add(new Bil("GH67890", UtleieGr.D, "Volvo V60", Farge.HVIT, 30000, true, 900, k2));

        Scanner input = new Scanner(System.in);

    }

    private static Kunde regKunde(){


        return null;
    }

    private static Reservasjon regReservasjon(){

        return null;
    }



    public class Validator{

        /**
         * Validerer fornavn og etternavn: Kun bokstaver og minst to tegn
         * @param navn
         * @return
          */
        public static boolean validerNavn(String navn) {
            return navn.matches("^[\\p{L} .'-]+$");
        }

        /**
         * Validerer norske telefonnumre: 8 sifre, kan starte med +47
         * @param nummer
         * @return
         */
        public static boolean validertelefon(String nummer) {
            return nummer.matches("(\\+47)?\\d{8}");
        }

        /**
         * Validerer adresser: Aksepterer bokstaver, tall og enkelte spesialtegn
         * @param adresse
         * @return
         */
        public static boolean validerAdresse(String adresse) {
            return adresse.matches("^[\\p{L}0-9 ,.'-]+$");
        }

        /**
         * Validerer kortnummer: 16 sifre
         * @param kortnummer
         * @return
         */
        public static boolean validerKort(String kortnummer) {
            return kortnummer.matches("\\d{16}");
        }


    }


}//end Main
