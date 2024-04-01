class Person {
    // Attributes
    protected String name;
    protected int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    // Additional attributes
    int employeeId;
    double salary;
    
    // Constructor
    public Employee(String name, int age, int employeeId, double salary) {
        // Call the constructor of the base class (Person)
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    
    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Salary: " + salary);
    }
}

public class practical18 {
    public static void main(String[] args) {
        // Create an object of Person
        Person person = new Person("John", 30);
        
        // Access attributes of Person class
        System.out.println("Person Details:");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        
        System.out.println(); // Print a blank line
        
        // Create an object of Employee
        Employee employee = new Employee("Alice", 25, 1001, 50000);
        
        // Access attributes of Employee class
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name); // Accessing attribute from base class
        System.out.println("Age: " + employee.age); // Accessing attribute from base class
        System.out.println("Employee ID: " + employee.employeeId);
        System.out.println("Salary: " + employee.salary);
    }
}