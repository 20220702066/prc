import java.util.Scanner;

public class practical8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        // Print Fibonacci sequence up to n terms
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        int prev = 0;
        int curr = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(prev + " ");
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        
        scanner.close();
    }
}