package prog1.Practice3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class task2 {
    public static void main(String[] args) {
        String number = showInputDialog("Write a number: ");
        int primeNumber = Integer.parseInt(number);

        if (primeNumber <= 1)
            showMessageDialog(null,"0 or negative numbers not allowed.");
            
        for (
            int i = 2; 
            i <= primeNumber / 2; 
            i++)
            if (primeNumber % 1 == 0)
                showMessageDialog(null, primeNumber + " is not a prime number");
            else {
                showMessageDialog(null, primeNumber + " is a prime number");
            }
        
        

        
            
        }
    }
