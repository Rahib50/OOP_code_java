public class AccountTester {
     public static void main(String[] args) {
          System.out.println("Total account holders: " + Account.count);
          System.out.println("1================");
          Account p1 = new Account("Abdul",45,"Service Holder",500000);
          p1.addMoney(300000);
          p1.printDetails();
          System.out.println("2================");
          Account p2 = new Account("Rahim",55,"Businessman",700000);
          p2.withdrawMoney(700000);
          p2.printDetails();
          System.out.println("3================");
          Account p3 = new Account("Ashraf",62,"Govt.Officer",200000);
          p3.withdrawMoney(250000);
          p3.printDetails();
          System.out.println("4================");
          System.out.println("Total account holders: " + Account.count);
        }      
}

class Account{
     public static int count = 0;
     String name;
     int age;
     String occ;
     double amount;

     public Account(String nam, int age, String occ, double amount){
          this.name = nam;
          this.age = age;
          this.occ = occ;
          this.amount = amount;
          count++;
     }

     public void printDetails(){
          System.out.println("Name: " + name);         
          System.out.println("Age: " + age);
          System.out.println("Occupation: " + occ);
          System.out.println("Total Amount: " + (int)amount);         
     }

     public void addMoney(double amount){
          this.amount += amount;
     }

     public void withdrawMoney(double money){
          if(amount-money >= 0){
               amount -= money;
          }
          else{
               System.out.println("Insufficient money for withdrawal!");
          }
     }

}