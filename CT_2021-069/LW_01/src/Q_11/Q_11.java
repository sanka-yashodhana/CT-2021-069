package Q_11;
import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name (first middle last): ");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();

        System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
    }
}

