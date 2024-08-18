public class MagicItem {
     String name;
     int energy_level;
     String [] Item = {"null", "null", "null"};
     
     public void newCharacter(String name){
          this.name = name;
     }

     public void displayInfo(){
          System.out.println("Character Name: " + this.name);
          System.out.println("Energy Level: " + this.energy_level);
          for (int i = 1; i <= Item.length; i++){
               System.out.println("Item " + i + ": " + this.Item[i-1]);
          }
     }

     public void findItem(String item){
          boolean picked_up = false;
          
          for (int i = 0; i < Item.length; i++){
               if(Item[i].equals("null")){
                    Item[i] = item;
                    System.out.println(this.name + " found a " + item);
                    picked_up = true;
                    break;
               }     
          }
          if (!picked_up){
               System.out.println("All slots occupied.");
          }
     }

     public void useItem(String item){
          boolean found = false;
          for(int i = 0; i < Item.length; i++){
               
               if(Item[i].equals(item)){
                    System.out.println(this.name + " used a " + Item[i]);
                    if(item.equals("Potion")){
                         energy_level += 50;
                    }
                    else if(item.equals("Elixir")){
                         energy_level += 100;
                    }
                    else if(item.equals("Amulet")){
                         energy_level += 200;
                    }
                    Item[i] = "null";
                    System.out.println("Energy level after using the item: " + this.energy_level);
                    found = true;
                    break;
               }
          } 
          if (!found){
               System.out.println("Item not in inventory.");
          } 
     }

}
