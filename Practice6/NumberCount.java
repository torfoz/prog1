import java.util.Arrays;

public class NumberCount {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int[] antall = new int[10];

        for (int i = 0; i < 10000; i++) {
            int tall = random.nextInt(10);
            antall[tall]++;
        }

        System.out.println(Arrays.toString(antall));
    }
}
