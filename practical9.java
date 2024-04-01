import java.util.Scanner;

public class practical9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two floating-point numbers
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();
        
        // Test whether the numbers are the same
        if (num1 == num2) {
            System.out.println("The numbers are the same.");
        } else {
            System.out.println("The numbers are different.");
        }
        
        scanner.close();
    }
}