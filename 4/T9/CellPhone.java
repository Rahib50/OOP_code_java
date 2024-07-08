public class CellPhone {
     String[] contact = {"", "", ""}; String model = "Unknown";
     int count = 0;

     public void printDetails(){
          System.out.println("Phone Model " + this.model);
          System.out.println("Contacts Stored " + this.count);
          if(count > 0){
               System.out.println("Stored Contacts: ");
               for(int i = 0; i < count; i++){
                    System.out.println(this.contact[i]);
               }
          }

     }
     public void storeContact(String x){
          if(count <= this.contact.length - 1){
               this.contact[count] = x;
               count++;
               System.out.println("Contact Stored");
          }
          else{
               System.out.println("Memory full. New contact can't be stored.");
          }

     }
}
