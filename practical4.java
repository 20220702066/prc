import java.util.Scanner;
public class practical4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        // Find the lowest number
        double lowest = num1;
        if (num2 < lowest) {
            lowest = num2;
        }
        if (num3 < lowest) {
            lowest = num3;
        }
        
        // Output the result
        System.out.println("The lowest number is: " + lowest);
        
        scanner.close();
    }
}
