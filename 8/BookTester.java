
public class BookTester {
     public static void main(String[] args) {
          System.out.println("Total Books Sold: " + Book.total_books_sold);
          System.out.println("Total Revenue: " + Book.total_revenue + " TK");
          System.out.println("==========1==========");

          Book b1 = new Book("Java Programming", 10); // 10% discount
          b1.bookDetails();

          System.out.println("==========2==========");

          Book b2 = new Book("Python Programming", 15); // 15% discount
          b2.bookDetails();

          System.out.println("==========3==========");

          Book b3 = new Book("Data Structures", 5); // 5% discount
          b3.bookDetails();

          System.out.println("==========4==========");
          System.out.println("Total Books Sold: " + Book.total_books_sold);
          System.out.println("Total Revenue: " + Book.total_revenue + " TK");
     }
}

// TASK2
class Book {
     static int total_books_sold;
     static double total_revenue;
     // price 150
     // price after discount
     public double discount;
     String book;

     public Book(String name, double d) {
          book = name;
          discount = 1 - d / 100;
          total_books_sold++;
     }

     public void bookDetails() {
          double price = 150 * discount;
          System.out.println("Title:" + book);
          System.out.println("Price after discount: " + price + " TK");
          total_revenue += price;
     }

}
