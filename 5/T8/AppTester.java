public class AppTester {
     public static void main(String args[]){
         
          UberApp account1 = new UberApp();
          UberApp account2 = new UberApp();
          
          account1.createProfile("Jonas Kahnwald", 24, "017111111111");
          account2.createProfile("Martha Nielsen", 28, "018111111111");
          
          account1.showProfile();
          System.out.println("===== 1 ====");
          System.out.println("You have "+ account1.remainingRides() +" ride(s) remaining.");
          
          System.out.println("==== 2 ====");
          account2.showProfile();
          System.out.println("You have "+ account2.remainingRides() +" ride(s) remaining.");
          System.out.println("==== 3 ====");
          account1.bookRide("Merul Badda", 12.0);
          
          System.out.println("==== 4 ====");
          account1.bookRide("Dhanmondi 27", 4.3);
          account1.changeLocation("Wari", 5.6);
          
          System.out.println("==== 5 ====");
          account1.ridingHistory();
          
          System.out.println("==== 6 ====");
          account2.ridingHistory();
          
          System.out.println("==== 7 ====");
          account1.bookRide("Banani 11", 6.8);
          account1.bookRide("Gulshan 1", 2.1);
          
          System.out.println("==== 8 ====");
          account1.resetMonth();
          account1.bookRide("Gulshan 1", 2.1);
          account1.ridingHistory();
          System.out.println("You have "+ account1.remainingRides() +" ride(s) remaining.");
   }
}

class UberApp{
     String name;
     int age;
     String phn;
     // max 3 rides
     String[] rides = new String[3];
     double Fare = 0;
     int count = 0;

     public void createProfile(String name, int age, String phn){
          this.name = name;
          this.age = age;
          this.phn = phn;  
     }

     public int remainingRides(){
          return rides.length - count;
     }

     public void showProfile(){
          System.out.println("Hello! This is your Profile: ");
          System.out.println("Full Name: " + this.name);
          System.out.println("Age: " + this.age);
          System.out.println("Phone Number: " + this.phn);
     }


     public void bookRide(String Location, double distance){
          Fare = 30 * distance;
          System.out.println(this.name + " has booked a ride!");
          System.out.println("Destination: " + Location);
          System.out.println("Fare: " + Fare + " Taka");

          boolean booked = false;
          for(int i = 0; i < rides.length; i++){
               if(rides[i] == null){
                    rides[i] = Location;
                    booked = true;
                    count++;
                    break;     
               }
          }
          if(!booked){
               System.out.println(this.name + ", please update your plan to premium or wait till next month!");
          }
     }

     public void changeLocation(String Location, double distance){
          System.out.println(this.name + " has changed the destination of his current ride to " + Location);
          rides[count-1] = Location;
          Fare = distance * 30;
          Fare += Fare * 0.2;
          System.out.println("New fare after adding 20% change fees: " + Fare + " Taka");          
     }

     public void resetMonth(){
          for(int i = 0; i < rides.length; i++){
               rides[i] = null;
          }
          count = 0;
     }

     public void ridingHistory(){
          if(count > 0){
               System.out.print(this.name + ", you have visited ");
               for(int i = 0; i < count; i++){
                    System.out.print(rides[i]);
                    if(i != count-1){
                         System.out.print(", ");
                    }
               }
               System.out.print(" this month.\n");
          }

          else{
               System.out.println(this.name + " you haven't visited anywhere this month.");
          }
     }
}

