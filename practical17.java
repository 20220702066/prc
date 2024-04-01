import java.util.Scanner;

class Student {
    // Attributes
    private int studentID;
    private String studentName;
    private double marksSubject1;
    private double marksSubject2;
    private double marksSubject3;
    
    // Method to set data for student
    public void setData(int id, String name, double marks1, double marks2, double marks3) {
        studentID = id;
        studentName = name;
        marksSubject1 = marks1;
        marksSubject2 = marks2;
        marksSubject3 = marks3;
    }
    
    // Method to display data for student
    public void displayData() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks in Subject 1: " + marksSubject1);
        System.out.println("Marks in Subject 2: " + marksSubject2);
        System.out.println("Marks in Subject 3: " + marksSubject3);
        System.out.println("Average Marks: " + calculateAverageMarks());
    }
    
    // Method to calculate average marks
    private double calculateAverageMarks() {
        return (marksSubject1 + marksSubject2 + marksSubject3) / 3.0;
    }
}

public class practical17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an object of Student class
        Student student = new Student();
        
        // Input data for the student
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        
        System.out.print("Enter Student Name: ");
        scanner.nextLine(); // Consume newline character left from previous input
        String name = scanner.nextLine();
        
        System.out.print("Enter Marks in Subject 1: ");
        double marks1 = scanner.nextDouble();
        
        System.out.print("Enter Marks in Subject 2: ");
        double marks2 = scanner.nextDouble();
        
        System.out.print("Enter Marks in Subject 3: ");
        double marks3 = scanner.nextDouble();
        
        // Set data for the student
        student.setData(id, name, marks1, marks2, marks3);
        
        // Display data for the student
        System.out.println("\nStudent Details:");
        student.displayData();
        
        scanner.close();
    }
}