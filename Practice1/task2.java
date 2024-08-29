import static javax.swing.JOptionPane.*;
public class task2 {
    public static void main(String[] args) {

        String readHour = showInputDialog("How many hours?: ");
        String readMinute = showInputDialog("How many minutes?:");
        String readSecond = showInputDialog("How many seconds?: ");

        int hours = Integer.parseInt(readHour);
        int minutes = Integer.parseInt(readMinute);
        int seconds = Integer.parseInt(readSecond);

        int answer = hours * 3600 + minutes * 60 + seconds;

        showMessageDialog(null, "Total seconds is equal to: " + answer + " seconds");
    }
}
