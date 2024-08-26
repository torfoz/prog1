import static javax.swing.JOptionPane.*;
public class secondsToTime {
    public static void main(String[] args) {
        
        String readSeconds = showInputDialog("How many seconds?: ");

        int seconds = Integer.parseInt(readSeconds);

        int hours = seconds / 3600;
        int minuteRemainder = seconds % 3600;
        int minutes = minuteRemainder / 60;
        int secondRemainder = minuteRemainder % 60;

        showMessageDialog(null, "Seconds is equal to: " + hours + " hours " + minutes + " minutes " + secondRemainder + " seconds ");
        }
    }
