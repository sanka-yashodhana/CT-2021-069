package Q_04;
import java.util.Scanner;
public class four {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your weight in pounds: ");
    double weight = scanner.nextDouble();

    double calories = weight * 19;

    System.out.printf("You need %.2f calories per day.%n", calories);
}
}

