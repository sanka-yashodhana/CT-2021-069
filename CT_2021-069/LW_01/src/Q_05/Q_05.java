package Q_05;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_05 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMM dd, yyyy");
        System.out.println(dateFormat.format(new Date()));
    }
}

