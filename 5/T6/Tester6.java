public class Tester6{
     public static void main(String [] args){
         Cart c1 = new Cart (); 
         Cart c2 = new Cart ();
         Cart c3 = new Cart ();
  
         c1.create_cart(1);
         c2.create_cart(2);
         c3.create_cart(3);
         System.out.println("====1====");
         c1.addItem("Table", 3900.5);
         c1.addItem("Chair", 1400.76);
         c1.addItem("Television", 5400.87);
         c1.addItem("Refrigerator", 5000);
  
         System.out.println("====2====");
         c2.addItem("Stove",439.90);
         
         System.out.println("====3====");
         c3.addItem("Chair",1400.5);
         c3.addItem("Chair",3400);
         
         System.out.println("====4====");
         c1.cartDetails();
         
         System.out.println("====5====");
         c2.cartDetails();
         
         System.out.println("====6====");
         c3.cartDetails();
         c1.giveDiscount(10);
         
         System.out.println("====7====");
         c1.cartDetails();
     }
}

class Cart{

    int cart_num;
    String[] items = {"null", "null", "null"};
    double[] item_costs = {0, 0, 0};
    int count = 0;
    double discount = 0;
    double total;

    public void create_cart(int n){
        cart_num = n;
    }

    public void addItem(String item, double cost){
        if (count != 3){
            items[count] = item;
            item_costs[count] = cost;
            count++;
            System.out.println(item + " added to cart " + cart_num + ".");
            System.out.println("You have " + count + " item(s) on your cart now.");
        }

        else{
            System.out.println("You already have 3 items on your cart");
        }
    }

    public void cartDetails(){
        System.out.println("Your cart(" + cart_num + ") :");

        for (int i = 0; i < count; i++){
            total += item_costs[i];
            System.out.println(items[i] + " - " + item_costs[i]);
        }

        System.out.println("Discount Applied: " + discount + "%");
        total = total/100 * (100-discount);
        System.out.println("Total price: " + this.total);
        total = 0;

    }

    public void giveDiscount(double dcount){
        discount = dcount;
        
    }



}
