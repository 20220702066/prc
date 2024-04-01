import java.util.Scanner;
public class practical7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to choose the conversion direction
        System.out.println("Choose the conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        
        double celsius, fahrenheit;
        
        switch (choice) {
            case 1:
                // Convert Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
                break;
            case 2:
                // Convert Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
                break;
            default:
                System.out.println("Invalid choice! Please enter either 1 or 2.");
                break;
        }
        
        scanner.close();
    }
}
