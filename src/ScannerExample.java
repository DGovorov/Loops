/**
 * Created by User on 16.02.2016.
 */
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        a = scanner.nextInt();
        System.out.println("Input second number: ");
        b = scanner.nextInt();

        System.out.println();

        System.out.println(a+b);
    }
}
