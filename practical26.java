import java.util.Scanner;

public class practical26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Define an array
            int[] numbers = {1, 2, 3, 4, 5};

            // Input the index
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();

            // Access the element at the specified index
            int value = numbers[index];

            // Display the value
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds exception
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Index is out of bounds.");
        }

        scanner.close();
    }
}