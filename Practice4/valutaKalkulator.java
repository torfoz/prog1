import java.util.Scanner;

class Valuta {
    private String navn;
    private double kursTilNOK;

    // Konstruktør
    public Valuta(String navn, double kursTilNOK) {
        this.navn = navn;
        this.kursTilNOK = kursTilNOK;
    }

    // Metode for å konvertere fra NOK til valuta
    public double fraNOK(double belopNOK) {
        return belopNOK / kursTilNOK;
    }

    // Metode for å konvertere fra valuta til NOK
    public double tilNOK(double belopValuta) {
        return belopValuta * kursTilNOK;
    }

    // Get-metode for valutaens navn
    public String getNavn() {
        return navn;
    }
}

public class valutaKalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Oppretter objekter for tre ulike valutaer
        Valuta dollar = new Valuta("Dollar", 8.88);  // Kurs 1 USD = 8.88 NOK
        Valuta danskeKroner = new Valuta("Danske kroner", 0.64);    // Kurs 1 EUR = 10.53 NOK
        Valuta svenskeKroner = new Valuta("Svenske kroner", 0.94);  // Kurs 1 SEK = 0.94 NOK

        while (true) {
            // Meny for å velge valuta
            System.out.println("Velg valuta: \n 1: Dollar \n 2: Danske kroner \n 3: Svenske kroner \n 4: Avslutt");
            System.out.print("Skriv inn valg (1-4): ");

            int valg = scanner.nextInt();

            // Avslutt programmet hvis brukeren velger 4
            if (valg == 4) {
                System.out.println("Programmet avsluttes.");
                break;
            }

            // Velg riktig valuta basert på brukerens input
            Valuta valgtValuta = null;
            if (valg == 1) {
                valgtValuta = dollar;
            } else if (valg == 2) {
                valgtValuta = danskeKroner;
            } else if (valg == 3) {
                valgtValuta = svenskeKroner;
            } else {
                System.out.println("Ugyldig valg. Prøv igjen.");
                continue;
            }

            // Be brukeren om å velge om konvertering skal være til eller fra NOK
            System.out.print("Velg retning (til NOK = 't', fra NOK = 'f'): ");
            char retning = scanner.next().charAt(0);

            if (retning == 't') {
                // Konverter fra valgt valuta til NOK
                System.out.print("Oppgi beløp i " + valgtValuta.getNavn() + ": ");
                double belop = scanner.nextDouble();
                double resultat = valgtValuta.tilNOK(belop);
                System.out.printf("%.2f %s = %.2f NOK\n", belop, valgtValuta.getNavn(), resultat);
            } else if (retning == 'f') {
                System.out.print("Oppgi beløp i Norske kroner: ");
                double belop = scanner.nextDouble();
                // Konverter fra NOK til valgt valuta
                double resultat = valgtValuta.fraNOK(belop);
                System.out.printf("%.2f NOK = %.2f %s\n", belop, resultat, valgtValuta.getNavn());
            } else {
                System.out.println("Ugyldig retning. Prøv igjen.");
            }
        }

        scanner.close();
    }
}
