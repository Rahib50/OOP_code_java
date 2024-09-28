public class BusTester {
     public static void main(String args[]){
          Bus b1 = new Bus(4, "Jatrabari");
          System.out.println("1--------------");
          Bus b2 = new Bus(10, "Gazipur");
          System.out.println("2--------------");
          b1.addPassenger("Fahim", "Mirpur");
          System.out.println("3--------------");
          b1.addPassenger("Anika", "Jatrabari");
          System.out.println("4--------------");
          b1.addPassenger("Ali");
          System.out.println("5--------------");
          b1.addPassenger("Zafar");
          System.out.println("6--------------");
          b1.addPassenger("Mim", "Badda");
          b1.addPassenger("Nowrin");
          System.out.println("7--------------");
          b1.addPassenger("Walid", "Jatrabari");
     }      
}

//TASK6
class Bus {
     int count = 0;
     String[] bus;
     String dest;

     public Bus(int cap, String location){
          dest = location;
          bus = new String[cap];
          System.out.println("Capacity:" + cap);
          System.out.println("Destination:" + location);
     }

     public void addPassenger(String name){
          if(count < bus.length){
               bus[count] = name;
               count++;
               System.out.println(name + " is added to the bus.\n" + name + " will get off at the last stop");
          }
          else{
               System.out.println("Bus is full.");
          }
     }

     public void addPassenger(String name, String location){
          if(location.equals(dest)){
               if(count < bus.length){
                    bus[count] = name;
                    count++;
                    System.out.println(name + " is added to the bus.");
               }
               else{
                    System.out.println("Bus is full.");
               }
          }
          else{
               System.out.println("Sorry "+ name +"! The bus won't stop at Mirpur\nUse another bus.");
          }
     }


}