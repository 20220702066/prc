public class practical14 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Print the current row number 'i'
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}