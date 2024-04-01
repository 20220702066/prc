import java.util.Scanner;

public class practical25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input the numerator and denominator
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;

            // Display the result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle arithmetic exception
            System.out.println("ArithmeticException: " + e.getMessage());
            System.out.println("Cannot divide by zero.");
        }

        scanner.close();
    }
}