
public class PassengerTester {
     public static void main(String args[]) {
          System.out.println("Total Passenger: " + Passenger.no_of_passenger);
          System.out.println("Total Fare: " + Passenger.total_fare + " TK");
          System.out.println("==========1==========");
          Passenger p1 = new Passenger("Lara", 5.6);
          p1.passengerDetails();
          System.out.println("==========2==========");
          Passenger p2 = new Passenger("Kevin", 10.0);
          p2.setBaggageWeight(6.8);
          p2.passengerDetails();
          System.out.println("==========3==========");
          Passenger p3 = new Passenger("Robin", 2.3);
          p3.setBaggageWeight(5);
          p3.passengerDetails();
          System.out.println("==========4==========");
          System.out.println("Total Passenger: " + Passenger.no_of_passenger);
          System.out.println("Total Fare: " + Passenger.total_fare + " TK");
     }
}

// Task 1
class Passenger {
     String name;
     double fare;
     public static int no_of_passenger;
     public static double total_fare;
     double distance;
     double weight;

     public Passenger(String name, double x) {
          this.name = name;
          no_of_passenger++;
          distance = x;
          fare = x * 20;
          total_fare += x * 20;
     }

     public void passengerDetails() {
          System.out.println("Name: " + name);
          System.out.println("Fare: " + fare + " TK");
     }

     public void setBaggageWeight(double x) {
          weight = x;
          fare += 10 * x;
          total_fare += 10 * x;
     }
}