public class ProductTester {
     public static void main(String[] args) {
          System.out.println("< —--—----1—-------->");
          Product product1 = new Product();
          product1.displayInfo();
          System.out.println();
          System.out.println("< —--—----2—-------->");
          Product product2 = new Product("Laptop", 1200.00);
          product2.setQuantity(10);
          product2.displayInfo(true); 
          System.out.println("< —--—----3—-------->");
          System.out.println("Retrieved Price: $" + product2.getPrice());
          System.out.println("Retrieved Quantity: " + product2.getQuantity());
     }
      
}

//Task6
class Product{
     private String item = "Unknown";
     private double cost;
     private int quantity;

     public Product() {
     }
     public Product(String item, double cost){
          this.setCost(cost);
          this.setItem(item);
     }

     public void setItem(String item){this.item = item;}
     public void setQuantity(int quant){this.quantity = quant ;}
     public void setCost(double cost){this.cost = cost;}

     public String getItem(){
          String x = this.item;
          return x;
          }

     public int getQuantity(){
          int x = this.quantity;
          return x;
          }

     public double getPrice(){
          double x = this.cost;
          return x;
     }

     public void displayInfo(){
          System.out.println("Product Name: " + this.getItem());
          System.out.println("Price: $" + this.getPrice());
          System.out.println("Quantity: " + this.getQuantity());

     }

     public void displayInfo(boolean t){
          System.out.println("Product Name: " + this.getItem());
          System.out.println("Price: $" + this.getPrice());
          System.out.println("Quantity: " + this.getQuantity());

     }

}
