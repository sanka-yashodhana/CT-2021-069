package Q_01;

public class one {public static void main(String[] args) {

    double A = 5, B = 3, C = 2;
    double X = 4, Y = 2;
    double radius = 5;


    double expressionA = Math.sqrt(Math.pow(B, 2) + 4 * A * C);
    System.out.println("a. Square root of B² + 4AC: " + expressionA);


    double expressionB = Math.sqrt(X + 4 * Math.pow(Y, 3));
    System.out.println("b. Square root of X + 4Y³: " + expressionB);


    double expressionC = Math.cbrt(X * Y);
    System.out.println("c. Cube root of XY: " + expressionC);


    double area = Math.PI * Math.pow(radius, 2);
    System.out.println("d. Area of circle with radius " + radius + ": " + area);
}
}
