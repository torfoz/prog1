import java.util.Random;

public class MinRandom {
    private Random random;

    public MinRandom() {
        random = new Random();
    }

    public int nesteHeltall(int nedre, int ovre) {
        return random.nextInt(ovre - nedre) + nedre;
    }
    public double nesteDesimaltall(double nedre, double ovre) {
        return random.nextDouble(ovre - nedre) + nedre;
    }

    public static void main(String[] args) {
        MinRandom minRandom = new MinRandom();

        System.out.println("Tilfeldig heltall: ");
        for (int i = 0; i < 10; i++) {
            int heltall = minRandom.nesteHeltall(10, 20);
            System.out.println(heltall);
        }

        System.out.println("\nTilfeldig desimaltall: ");
        for (int i = 0; i < 10; i++) {
            double desimaltall = minRandom.nesteDesimaltall(1.5, 4.0);
            System.out.println(desimaltall);
        }
    }
}
