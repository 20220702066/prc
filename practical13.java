import java.util.Scanner;

public class practical13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Display the multiplication table
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        scanner.close();
    }
}