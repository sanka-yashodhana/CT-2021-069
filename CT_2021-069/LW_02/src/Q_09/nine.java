package Q_09;
import java.util.Scanner;
public class nine { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter principal amount (P): ");
    double principal = scanner.nextDouble();

    System.out.print("Enter annual interest rate (R): ");
    double rate = scanner.nextDouble();

    System.out.print("Enter number of years (N): ");
    int years = scanner.nextInt();

    double amount = principal * Math.pow(1 + (rate / 100), years);

    System.out.printf("After %d years at %.2f%% interest, your investment will grow to $%.2f%n",
            years, rate, amount);
}
}

