import java.util.Arrays;
import java.util.Scanner;

class Tekstanalyse {
    private String tekst;
    private int[] antallTegn = new int[30];

    public Tekstanalyse(String tekst) {
        this.tekst = tekst;
    }

    public int totalAntallTegn() {
        return tekst.length();
    }

    public int[] sammeTegn() {
        tekst = tekst.toLowerCase();
        for (int i = 0; i < totalAntallTegn(); i++) {
            char tegn = tekst.charAt(i);
            if (tegn >= 'a' && tegn <= 'z') {
                antallTegn[tegn - 'a']++;
            } else if (tegn == 'æ') {
                antallTegn[26]++;
            } else if (tegn == 'ø') {
                antallTegn[27]++;
            } else if (tegn == 'å') {
                antallTegn[28]++;
            } else {
                antallTegn[29]++;
            }
        }
        return antallTegn;
    }

    public int antallForskjellige() {
        int sum = 0;
        for (int i = 0; i < 28; i++) {
            if (antallTegn[i] > 0) {
                sum++;
            }
        }
        return sum;
    }


    public double prosentAvTegn() {
        int sum = tekst.length();
        double prosent = (double) antallTegn[29] / sum * 100;
        return prosent;

    }

    public int finnBokstav(char bokstav) {
        int antall = 0;
        tekst = tekst.toLowerCase();
        bokstav = Character.toLowerCase(bokstav);

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == bokstav) {
                antall++;
            }
        }

        return antall;
    }

    public String mestAv() {
        int maks = 0;
        StringBuilder mestVanlig = new StringBuilder();

        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > maks) {
                maks = antallTegn[i];
                mestVanlig = new StringBuilder();
                mestVanlig.append((char) (i + 'a'));
            } else if (antallTegn[i] == maks) {
                mestVanlig.append((char) (i + 'a'));
            }
        }
        return mestVanlig.toString();
    }
}

public class AnalyseAvTekst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTekst;
        while (true) {
            System.out.print("Skriv en tekst: ");
            inputTekst = scanner.nextLine();
            Tekstanalyse tekst = new Tekstanalyse(inputTekst);
            System.out.println(Arrays.toString(tekst.sammeTegn()));
            System.out.println("Antall bokstaver og tegn: " + tekst.totalAntallTegn());
            System.out.println("Antall forskjellige bokstaver: " + tekst.antallForskjellige());
            System.out.println("Prosent av tegn: " + tekst.prosentAvTegn());
            System.out.println("Antall av A: " + tekst.finnBokstav('A'));
            System.out.println("Det er mest av: " + tekst.mestAv());
        }
    }
}
