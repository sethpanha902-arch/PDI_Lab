package Exercise2; 
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== CALCULATOR =====");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Sum from 1 to n");

        System.out.print("Choose an option: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter first number: ");
                double a = input.nextDouble();

                System.out.print("Enter second number: ");
                double b = input.nextDouble();

                System.out.println("Result: " + (a + b));
                break;

            case 2:
                System.out.print("Enter first number: ");
                double c = input.nextDouble();

                System.out.print("Enter second number: ");
                double d = input.nextDouble();

                System.out.println("Result: " + (c - d));
                break;

            case 3:
                System.out.print("Enter first number: ");
                double e = input.nextDouble();

                System.out.print("Enter second number: ");
                double f = input.nextDouble();

                System.out.println("Result: " + (e * f));
                break;

            case 4:
                System.out.print("Enter first number: ");
                double x = input.nextDouble();

                System.out.print("Enter second number: ");
                double y = input.nextDouble();

                if (y != 0) {
                    System.out.println("Result: " + (x / y));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            case 5:
                System.out.print("Enter n: ");
                int n = input.nextInt();

                int sum = 0;

                for (int i = 1; i <= n; i++) {
                    sum += i;
                }

                System.out.println("Sum from 1 to " + n + " = " + sum);
                break;

            default:
                System.out.println("Invalid option.");
        }

        input.close();
    }
}
