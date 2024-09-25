import static javax.swing.JOptionPane.showInputDialog;

public class tenTimes {
    public static void main(String[] args) {
        String chooseFirstNumber = showInputDialog("Choose a number: ");
        String chooseSecondNumber = showInputDialog("Choose a second number: ");
        int firstNumber = Integer.parseInt(chooseFirstNumber);
        int secondNumber = Integer.parseInt(chooseSecondNumber);

        do {
            for (int i=1; i<11; i++) {
                int answer = firstNumber * i;
                System.out.println(firstNumber + " * " + i + " = " + answer);
            }
            firstNumber++;
            System.out.println("\n");
        }
        while (firstNumber <= secondNumber);
    }
}
