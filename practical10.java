import java.util.Scanner;

public class practical10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a single character
        System.out.print("Enter a single character from the alphabet: ");
        String input = scanner.nextLine();
        
        // Check the length of the input
        if (input.length() != 1) {
            System.out.println("Error: Please enter only a single character.");
        } else {
            char ch = input.charAt(0);
            
            // Check if the input is a letter
            if (!Character.isLetter(ch)) {
                System.out.println("Error: Input is not a letter.");
            } else {
                // Convert the character to lowercase
                ch = Character.toLowerCase(ch);
                
                // Check if the input is a vowel or consonant
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            }
        }
        
        scanner.close();
    }
}