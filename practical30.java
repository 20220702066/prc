public class practical30 {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive data types to wrapper objects
        Integer numInteger = 10; // Autoboxing int to Integer
        Double numDouble = 3.14; // Autoboxing double to Double
        Character charCharacter = 'A'; // Autoboxing char to Character
        Boolean boolBoolean = true; // Autoboxing boolean to Boolean

        // Printing autoboxed values
        System.out.println("Autoboxing:");
        System.out.println("Integer value: " + numInteger);
        System.out.println("Double value: " + numDouble);
        System.out.println("Character value: " + charCharacter);
        System.out.println("Boolean value: " + boolBoolean);

        // Unboxing: Converting wrapper objects to primitive data types
        int intValue = numInteger; // Unboxing Integer to int
        double doubleValue = numDouble; // Unboxing Double to double
        char charValue = charCharacter; // Unboxing Character to char
        boolean boolValue = boolBoolean; // Unboxing Boolean to boolean

        // Printing unboxed values
        System.out.println("\nUnboxing:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + boolValue);
    }
}