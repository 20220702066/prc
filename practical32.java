public class practical32 {
    public static void main(String[] args) {
        // Method 1: length()
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Method 2: charAt()
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Method 3: substring()
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Method 4: indexOf()
        int indexOf = str.indexOf('W');
        System.out.println("Index of 'W': " + indexOf);

        // Method 5: toLowerCase()
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercase);
    }
}