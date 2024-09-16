public class BookTester {
    public static void main(String[] args) {
        System.out.println("< —--—----1—-------->");
        Book b1 = new Book("The Alchemist");
        b1.displayDetails(); 
        System.out.println("< —--—----2—-------->");
        Book b2 = new Book("1984", "George Orwell");
        b2.displayDetails();  
        System.out.println("< —--—----3—-------->");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee", 300);
        b3.displayDetails();
        System.out.println("< —--—----4—-------->");
        b1.setDetails(250); 
        b1.displayDetails();  
        System.out.println("< —--—----5—-------->");
        b2.setDetails("Orwell", 350); 
        b2.displayDetails();  
    }   
}

//Task 5
class Book{
    String name;
    String auth;
    int price;
    public Book(String name){
        this.name = name;
    }

    public Book(String name, String auth){
        this.name = name;
        this.auth = auth;
    }

    public Book(String name, String auth, int price){
        this.name = name;
        this.auth = auth;
        this.price = price;
    }

    public void displayDetails(){
        if(this.name != null){
            System.out.print("Title: " + this.name);
        }
        
        if(auth != null){
            System.out.print(", Author: " + auth);
        }
        
        if(price != 0){
            System.out.print(", Price: " + price);
        }
        
        System.out.println();
    }

    public void setDetails(int price){
        this.price = price;
    }
    public void setDetails(String auth, int price){
        this.auth = auth;
        this.price = price;
    }


}
