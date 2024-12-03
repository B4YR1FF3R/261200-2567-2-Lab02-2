class Book {
    private final String title;
    private final String author;
    private double price;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // New Method: applyDiscount
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage <= 0.0 || discountPercentage >= 100.0) {
            System.out.println("Error: Invalid discount percentage. It must be greater than 0.0 and less than 100.0.");
            return;
        }

        double discountAmount = price * (discountPercentage / 100);
        double newPrice = price - discountAmount;
        price = newPrice;

        System.out.printf("Discount of %.2f%% applied. New price: %.2f\n", discountPercentage, price);
    }

    public static void main(String[] args) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(320.00);
        hp1Book.displayDetails();

        // Test applyDiscount
        hp1Book.applyDiscount(-20);   // Invalid
        hp1Book.applyDiscount(0);     // Invalid
        hp1Book.applyDiscount(0.5);   // Valid
        hp1Book.applyDiscount(25.00); // Valid
        hp1Book.applyDiscount(50);    // Valid
        hp1Book.applyDiscount(100.00);// Invalid
        hp1Book.applyDiscount(150);   // Invalid

    }
}


