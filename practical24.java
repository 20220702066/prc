import java.util.Scanner;

public class practical24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = calculateSumOfDigits(number);

        // Display the sum of digits
        System.out.println("Sum of digits in " + number + " is: " + sum);

        scanner.close();
    }

    // Method to calculate sum of digits
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}