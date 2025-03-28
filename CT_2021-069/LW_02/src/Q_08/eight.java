package Q_08;
import java.util.Scanner;
public class eight {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final double PI = 3.14;

    System.out.print("Enter the radius of the sphere: ");
    double radius = scanner.nextDouble();

    double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);

    System.out.printf("The volume of the sphere with radius %.2f is %.2f%n",
            radius, volume);
}
}

