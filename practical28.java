class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class practical28 {
    // Method that declares it may throw a CustomException
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            // Call a method that may throw a custom exception
            validateAge(15);
        } catch (CustomException e) {
            // Catch the custom exception and handle it
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}