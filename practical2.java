import java.util.Scanner;
public class practical2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        
        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        
        scanner.close();
    }
}
