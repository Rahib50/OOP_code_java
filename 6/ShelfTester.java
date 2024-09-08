//Task2
public class ShelfTester {
    public static void main(String [] args){
        Shelf shelf = new Shelf();
        shelf.showDetails();
        System.out.println("1---------------");
        shelf.addBooks(3);
        System.out.println("2---------------");
        shelf.capacity = 7;
        shelf.addBooks(3);
        System.out.println("3---------------");
        shelf.showDetails();
        System.out.println("4---------------");
        shelf.addBooks(5);
        shelf.showDetails();
        shelf.capacity += 4;
        System.out.println("6---------------");
        shelf.addBooks(5);
        shelf.showDetails();
      }    
}

//Task 2
class Shelf{
    int capacity;
    int booksN;
    public void showDetails(){
        System.out.println("Shelf capacity: " + this.capacity);
        System.out.println("Number of books: " + this.booksN);
    }

    public void addBooks(int n){
        if (capacity == 0){
            System.out.println("Zero capaxity. Cannot add books.");
        }

        else if(capacity < booksN + n){
            System.out.println("Exceeds capacity");
        }
        

        else{
            System.out.println(n + " books added to shelf");
            booksN += n;
        }
    }
}
