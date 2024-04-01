public class practical33 {
    public static void main(String[] args) {
        // Method 1: append()
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World!");
        System.out.println("After appending: " + stringBuffer);

        // Method 2: insert()
        stringBuffer.insert(5, ", Java");
        System.out.println("After inserting: " + stringBuffer);

        // Method 3: delete()
        stringBuffer.delete(5, 11);
        System.out.println("After deleting: " + stringBuffer);

        // Method 4: reverse()
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);

        // Method 5: replace()
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("After replacing: " + stringBuffer);
    }
}