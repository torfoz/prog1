import java.util.Arrays;
import java.util.Scanner;

public class Tekstbehandling {
    private final String tekst;
    String skille = "[,.\\s]";
    String mellomrom = " ";
    String tegn = "[.,!:?]";

    public Tekstbehandling(String tekst) {
        this.tekst = tekst;
    }

    public int antallOrd() {
        String antall = tekst.replaceAll(skille, "");
        return antall.length();
    }

    public double gjennomsnitt() {
        String utenTegn = tekst.replaceAll(tegn, "");
        String[] ord = utenTegn.split(mellomrom);
        int sum = 0;
        for (int i = 0; i < ord.length; i++) {
            sum += ord[i].length();
        }
        return (double) sum / ord.length;
    }

    public double gjennomsnittPeriode() {
        String forkortet = tekst.replaceAll(mellomrom, "");
        String[] ord = forkortet.split(tegn);
        int sum = 0;
        for (int i = 0; i < ord.length; i++) {
            sum += ord[i].length();
        }
        return (double) sum / ord.length;
    }

    public String skifte(String aaEndre, String endre) {
        String[] ord = tekst.split(mellomrom);
        for (int i = 0; i < ord.length; i++) {
            if (ord[i].equals(aaEndre)) {
                ord[i] = endre;
            }
        }
        return Arrays.toString(ord);
    }

    public String uendret() {
        return tekst;
    }

    public String storeBokstaver() {
        return tekst.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv en tekst: ");
        String inputTekst = sc.nextLine();
        Tekstbehandling tekst = new Tekstbehandling(inputTekst);
        System.out.println(tekst.antallOrd());
        System.out.println(tekst.gjennomsnitt());
        System.out.println(tekst.gjennomsnittPeriode());
        System.out.println(tekst.skifte("en", "to"));
        System.out.println(tekst.uendret());
        System.out.println(tekst.storeBokstaver());
    }
}
