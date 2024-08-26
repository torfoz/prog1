import static javax.swing.JOptionPane.*;
public class inchToCentimeter {
    public static void main(String[] args) {
        
        String readInches = showInputDialog("Inches: ");

        int inches = Integer.parseInt(readInches);
        double cmConvertion = 2.54;

        double answer = inches * cmConvertion;

        showMessageDialog(null, "Answer: " + answer + " cm");
    }
}
