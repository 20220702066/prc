import java.util.Scanner;

public class practical6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to choose the conversion direction
        System.out.println("Choose the conversion direction:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        
        double kilometer, mile;
        
        switch (choice) {
            case 1:
                // Convert kilometers to miles
                System.out.print("Enter distance in kilometers: ");
                kilometer = scanner.nextDouble();
                mile = kilometer * 0.621371;
                System.out.println(kilometer + " kilometers is equal to " + mile + " miles.");
                break;
            case 2:
                // Convert miles to kilometers
                System.out.print("Enter distance in miles: ");
                mile = scanner.nextDouble();
                kilometer = mile / 0.621371;
                System.out.println(mile + " miles is equal to " + kilometer + " kilometers.");
                break;
            default:
                System.out.println("Invalid choice! Please enter either 1 or 2.");
                break;
        }
        
        scanner.close();
    }
}