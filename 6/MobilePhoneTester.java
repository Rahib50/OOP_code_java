public class MobilePhoneTester {
     public static void main(String args []){
          MobilePhone m1 = new MobilePhone();
          MobilePhone m2 = new MobilePhone();
          m1.setContactCapacity(5);
          m2.setContactCapacity(100);
          m1.details();
          System.out.println("1----------------");
          m1.addContact("John", 9866);
          m1.addContact("Maria", 7865);
          System.out.println("2----------------");
          m1.makeCall(9866);
          System.out.println("3----------------");
          m1.addContact("Henry", 2365);
          System.out.println("4----------------");
          m1.makeCall(7552);
          m1.makeCall(2365);
          System.out.println("5----------------");
          m1.addContact("Gomes", 4589);
          m1.addContact("Antony", 8421);
          m1.addContact("Tony", 5789);
          System.out.println("6----------------");
          m1.details();
        }      
}

//Task5
class MobilePhone{
     int contacts = 0;
     String[] contact_list;
     int[] number;

     public void setContactCapacity(int cap){
          contacts = cap;
          contact_list = new String[cap];
          number = new int[cap];
     }

     public void details(){
          System.out.println("Total Contacts: " + contacts);
          System.out.println("Contact List: ");
          for(int i = 0; i < contact_list.length; i++){
               if(contact_list[i] != null){
                    System.out.println(contact_list[i] + ":" + number[i]);
               }
          }
     }

     public void addContact(String name, int num){
          boolean flag = false;
          for(int i = 0; i < contact_list.length; i++){
               if(contact_list[i] == null){
                    contact_list[i] = name;
                    number[i] = num;
                    flag = true;
                    System.out.println("The contact of " + contact_list[i] + " is added.");
                    break;
               }
          }
          if(!flag){
               System.out.println("Storage Full!!");
          }
     }

     public void makeCall(int num){
          boolean flag = false;
          for(int i = 0; i < number.length; i++){
               if(number[i] == num){
                    System.out.println("Calling  " + contact_list[i] + " . . .");
                    flag = true;
                    break;
               }
          }
          if(!flag){
               System.out.println("Calling " + num + " . . .");
          }
     }

}
