class Product {
    // Attributes
    protected int productId;
    protected String productName;
    protected double price;
    
    // Constructor
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    
    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

// Derived class Electronics
class Electronics extends Product {
    // Additional attributes
    private String brand;
    
    // Constructor
    public Electronics(int productId, String productName, double price, String brand) {
        super(productId, productName, price);
        this.brand = brand;
    }
    
    // Override displayDetails() method to include brand
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
    }
}

// Derived class Clothing
class Clothing extends Product {
    // Additional attributes
    private String size;
    private String color;
    
    // Constructor
    public Clothing(int productId, String productName, double price, String size, String color) {
        super(productId, productName, price);
        this.size = size;
        this.color = color;
    }
    
    // Override displayDetails() method to include size and color
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }
}

// Derived class Books
class Books extends Product {
    // Additional attributes
    private String author;
    
    // Constructor
    public Books(int productId, String productName, double price, String author) {
        super(productId, productName, price);
        this.author = author;
    }
    
    // Override displayDetails() method to include author
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

public class practical20 {
    public static void main(String[] args) {
        // Create objects of each class
        Electronics laptop = new Electronics(101, "Laptop", 899.99, "Dell");
        Clothing shirt = new Clothing(201, "T-Shirt", 19.99, "M", "Blue");
        Books novel = new Books(301, "To Kill a Mockingbird", 12.99, "Harper Lee");
        
        // Demonstrate polymorphism by displaying product details
        System.out.println("Product Details:");
        System.out.println("---------------");
        laptop.displayDetails();
        System.out.println();
        shirt.displayDetails();
        System.out.println();
        novel.displayDetails();
    }
}