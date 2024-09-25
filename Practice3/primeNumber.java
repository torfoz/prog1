import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class primeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            String number = showInputDialog("Write a number: ");
            int primeNumber = Integer.parseInt(number);
            if (isPrime(primeNumber)) {
                System.out.println(primeNumber + " is a prime number");
            } else {
                System.out.println(primeNumber + " is not a prime number");
            }
        }
    }
}
