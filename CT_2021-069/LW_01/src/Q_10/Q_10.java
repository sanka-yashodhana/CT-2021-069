package Q_10;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();
        int middleIndex = word.length() / 2;
        System.out.println(word.charAt(middleIndex));
    }
}

