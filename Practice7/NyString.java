import java.util.Scanner;

public final class NyString {
    private final String tekst;
    String skille = " ";

    public NyString(String tekst) {
        this.tekst = tekst;
    }

    public String forkorting() {
        String[] ord = tekst.split(skille);
        for (int i = 0; i < ord.length; i++) {
            ord[i] = ord[i].substring(0, 1);
        }
        return String.join("", ord);

    }

    public String fjernBokstav(String bokstav) {
        String[] ord = tekst.split(skille);
        for (int i = 0; i < ord.length; i++) {
            ord[i] = ord[i].replaceAll(bokstav, "");
        }
        return String.join(" ", ord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Skriv en tekst: ");
            String inputTekst = scanner.nextLine();
            String forkorting = new NyString(inputTekst).forkorting();
            System.out.println(forkorting);
            System.out.print("Skriv en bokstav: ");
            String inputBokstav = scanner.nextLine();
            String fjerne = new NyString(inputTekst).fjernBokstav(inputBokstav);
            System.out.println(fjerne);
        }
    }
}
