import java.util.Scanner;

// Define a class named Adder
class Adder {
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class practical16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an object of the Adder class
        Adder adder = new Adder();
        
        // Input the two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        // Call the add method of the Adder class using the object
        int sum = adder.add(number1, number2);
        
        // Print the sum
        System.out.println("Sum: " + sum);
        
        scanner.close();
    }
}