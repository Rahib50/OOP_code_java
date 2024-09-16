public class ParcelDriver {
     public static void main(String[] args){
          Parcel p1 = new Parcel();
          p1.printDetails();
          p1.name = "Spongebob";
          p1.printDetails();
          System.out.println("1**************");
          Parcel p2 = new Parcel("Bob the Builder");
          p2.weight = 15;
          p2.calcFee("Gulshan");
          p2.printDetails();
          System.out.println("2**************");
          p2.addWeight(25);
          p2.calcFee("Banani");        
          p2.printDetails();
          System.out.println("3**************");
          Parcel p3 = new Parcel("Dora the Explorer", 10);
          p3.addWeight(15);
          p3.calcFee("Dhanmondi");
          p3.printDetails();
     }    
}

//Task3
class Parcel{
     String name;
     int weight;
     double fee;
     int loc_charge = 0;

     public Parcel(){
     }

     public Parcel(String name){
          this.name = name;
     }

     public Parcel(String name, int weight){
          this.name = name;
          this.weight = weight;
     }

     public void printDetails(){
          if(name == null){
               System.out.println("Set name first");
          }

          else{
               System.out.println("Name: " + this.name);
               System.out.println("Total Weight: " + this.weight);
               System.out.println("Total Fee: " + this.fee);              
          }
     }

     public void addWeight(int n){
          weight += n;
          System.out.println("Updated weight: " + this.weight);
     }

     public void calcFee(String loc){
          if (loc.equals("Dhanmondi")){
               loc_charge = 50;
          }
          fee = weight*20 + loc_charge;
     }


}
