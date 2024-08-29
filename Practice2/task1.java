package prog1.Practice2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class task1 {
    public static void main(String[] args) {
        String readYear = showInputDialog("Write a year: ");

        int year = Integer.parseInt(readYear);

        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            showMessageDialog(null, year + " is a leap year.");
        } else {
            showMessageDialog(null, year + " is not a leap year");
        }
    }
}
