package Q_07;
import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_07 {
    public static void main(String[] args) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        String time = timeFormat.format(new Date());

        JFrame frame = new JFrame(time);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



