public class practical15 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern
        int count = 1; // Starting number for the pattern

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " "); // Print the current count
                count++; // Increment the count for the next number
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}