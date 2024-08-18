public class Reader_tester {
        public static void main(String[] args){
       Reader r1 = new Reader();
       Reader r2 = new Reader();
       
       r1.createReader("Messi", 2);
       r2.createReader("Ronaldo", 5);
       
       System.out.println("1 ==========");
       r1.readerInfo();
       
       System.out.println("2 ==========");
       r2.addBook("Java");
       r2.addBook("Python");
       r2.addBook("C++");
       r2.readerInfo();
       
       System.out.println("3 ==========");
       r1.addBook("C#");
       r1.addBook("Rust");
       r1.addBook("GoLang");
       
       System.out.println("4 ==========");
       r1.increaseCapacity(5);
       r1.addBook("Python");
       
       System.out.println("5 ==========");
       r1.readerInfo();
   }
}

class Reader{
     String name = "New user";
     int capacity = 0;
     String[] books = new String[capacity];

     public void createReader(String name , int cap){
          capacity = cap;
          this.name = name;
          books = new String[capacity]; 
     }

     public void readerInfo(){

          boolean flag = false;
          System.out.println("Name: " + this.name);
          System.out.println("Capacity: " + this.capacity);
          System.out.println("Books: ");

          for(int i = 0; i < books.length; i++){
               if(books[i] != null){
                    System.out.println("Book " + (i+1) + ": " + books[i]);
                    flag = true;
               }
          }
          if(!flag){
               System.out.println("No books added yet");
          }

     }

     public void addBook(String new_book){
          boolean flag = false;
          for(int i = 0; i < books.length; i++){
               if (books[i] == null){
                    books[i] =  new_book;
                    flag = true;
                    break;
               }
          }
          if(!flag){
               System.out.println("No more space for new book");
          }
     }

     public void increaseCapacity(int cap){
          this.capacity = cap;
          String[] temp_shelf = new String[this.capacity];
          for(int i = 0; i < books.length; i++){
               temp_shelf[i] = books[i];
          }

          books = new String[capacity];
          for(int i = 0; i < books.length; i++){
               books[i] = temp_shelf[i];
          }

          System.out.println(this.name + "'s" + " capacity increased to " + cap);
     }
}
