package Q_02;
import java.util.Scanner;

public class two {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter length in centimeters: ");
    double centimeters = scanner.nextDouble();


    double inches = centimeters / 2.54;


    int feet = (int) (inches / 12);
    double remainingInches = inches % 12;

    System.out.printf("%.2f cm = %d feet %.2f inches%n", centimeters, feet, remainingInches);
}
}

