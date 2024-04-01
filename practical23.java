import java.util.Scanner;

public class practical23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate factorial
        long factorial = calculateFactorial(number);

        // Display the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }

    // Method to calculate factorial recursively
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}