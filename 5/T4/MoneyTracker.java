public class MoneyTracker {
       double balance;
       String name;
       double last_spent;
       double last_added;

       public void createTracker(String nam){
              name = nam;
              balance = 1;
       }

       public String info(){
              return ("Name: " + this.name + "\nCurrent balance: " + this.balance);
              
       }

       public void expense(int exp){
              if(balance - exp < 0){
                     System.out.println("Not enough balance.");
              }
              else{
                     balance -= exp;
                     last_spent = exp;
                     if(balance == 0){
                            System.out.println("You're broke!");
                     }
                     else{
                            System.out.println("Balance Updated.");
                     }
              }
       }

       public void income(int inc){
              this.balance += inc;
              last_added = inc;
              System.out.println("Balance Updated! ");
       }

       public void showHistory(){
              System.out.println("Last added: " + last_added + "\nLast spent: " + last_spent);
       }

       
}
