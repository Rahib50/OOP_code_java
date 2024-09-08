public class BurgerMaker {
     public static void main(String [] args){
          ChickenBurger b1 = new ChickenBurger();
          System.out.println(b1.bun);
          System.out.println(b1.price);
          System.out.println(b1.sauceOption);
          System.out.println(b1.spiceLevel);
          System.out.println("----------1----------");
          System.out.println(b1.serveBurger());
          System.out.println("----------2----------");
          b1.customizeSpiceLevel("Extreme Jhaal");
          b1.customizeSpiceLevel("Spicy");
          System.out.println("----------3----------");
          System.out.println(b1.serveBurger());
          System.out.println("----------4----------");
          ChickenBurger b2 = new ChickenBurger();
          b2.bun = "Brioche";
          b2.price += 50;
          b2.sauceOption = "Regular";
          b2.customizeSpiceLevel("Naga");
          System.out.println("----------5----------");
          System.out.println(b2.serveBurger());
       }     
}

//Task4
class ChickenBurger{
     String[] spiceList = {"Mild", "Spicy", "Naga", "Extreme"};
     String bun = "Sesame";
     int price = 200;
     String sauceOption = "Less";
     String spiceLevel = "Not Set";

     public String serveBurger(){
          if(spiceLevel.equals("Not Set")){
               return ("Cannot serve now. Customize Spice Level first.");
          }
          else{
               return ("The burger is being served:- " + "\nBun Type: " + this.bun + "\nPrice: " + this.price + "\nSauce Option: "+ this.sauceOption + "\nSpice Level: " + this.spiceLevel);
          }
     }

     public void customizeSpiceLevel(String spice){
          boolean set = false;
          for(int i = 0; i < spiceList.length; i++){
               if(spiceList[i].equals(spice)){
                    set = true;
                    spiceLevel = spiceList[i];
                    System.out.println("Spice level set to " + spiceLevel + ".");
                    break;
               }
          }
          if(!set){
               System.out.println("This spice level is unavailable.");
          }
     }
}
