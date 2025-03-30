package Q_01;

import java.util.Scanner;

class Temperature {
    private double celsius;


    public Temperature() {
        this.celsius = 0.0;
    }


    public Temperature(double celsius) {
        this.celsius = celsius;
    }


    public double toCelsius() {
        return celsius;
    }


    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }


    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }


    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}
public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        Temperature temp = new Temperature(celsiusInput);
        System.out.printf("%.2f°C is %.2f°F\n", temp.toCelsius(), temp.toFahrenheit());

        scanner.close();
    }
}