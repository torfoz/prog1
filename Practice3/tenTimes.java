import static javax.swing.JOptionPane.showInputDialog;

public class tenTimes {
    public static void main(String[] args) {
        String chooseNumber = showInputDialog("Choose a number: ");
        int number = Integer.parseInt(chooseNumber);
        int currentNumber = 1;

        while (currentNumber < 11) {
            int answer = number * currentNumber;
            System.out.println(number + " * " + currentNumber + " = " + answer);
            currentNumber = currentNumber + 1;
        }
    }
}
