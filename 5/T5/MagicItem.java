public class MagicItem {
     String name;
     int energy_level;
     String [] Item = new String[3];
     
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
               if(Item[i].equals(null)){
                    Item[i] = item;
                    System.out.println(this.name + " found a " + item);
                    picked_up = true;
               }
               if (!picked_up){
                    System.out.println("All slots occupied.");
               }
          }
     }

     public void useItem(String item){
          
     }

}
