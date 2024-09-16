public class ABCServerTester {
     public static void main (String args []){
          ABCServer server1 = new ABCServer();
          server1.details();
          System.out.println("---------------");
          ABCServer server2 = new ABCServer("Heroes Reborn",6);
          server2.details();
          System.out.println("---------------");
          server2.addMembers("Edward");
          server2.addMembers("William");
          System.out.println("----------------");
          server2.details();
          System.out.println("----------------");
          server2.addMembers("John", "Hero's Mentor");
          server2.addMembers("Albert", "Thunderstrike");
          server2.addMembers("Max", "Radiant Avenger");
          System.out.println("----------------");
          server2.details();
          System.out.println("----------------");
          server2.addMembers("Daniel");
          server2.addMembers("Donal", "Valor Knight");
          System.out.println("----------------");
          server2.details();
     }       
}

class ABCServer{
     String name = "Default";
     int cap = 10;
     int members = 0;
     String[] names;
     String[] roles;


     public ABCServer(){
          names = new String[cap];
          roles = new String[cap];
     }

     public ABCServer(String nam, int cap){
          this.name = nam;
          this.cap = cap;
          names = new String[cap];
          roles = new String[cap];
     }

     public void addMembers(String nam){
          boolean flag = false;
          for(int i = 0; i < cap; i++){
               if(names[i] == null){
                    names[i] = nam;
                    roles[i] = "Rising Hero";
                    members++;
                    flag = true;
                    System.out.println(roles[i] + " is added.");
                    break;
               }
          }
          if(!flag){System.out.println("Sorry, maximum capacity exceeded!");}
     }

     public void addMembers(String nam, String role){
          boolean flag = false;
          for(int i = 0; i < cap; i++){
               if(names[i] == null){
                    names[i] = nam;
                    roles[i] = role;
                    members++;
                    flag = true;
                    System.out.println(roles[i] + " is added.");
                    break;
               }
          }

          if(!flag){System.out.println("Sorry, maximum capacity exceeded!");}
     }

     public void details(){
          System.out.println("Server Name: " + this.name);
          System.out.println("Member Capacity: " + this.cap);
          System.out.println("Total Members: " + this.members);
          System.out.println("Members: ");
          
          for(int i = 0; i < members; i++){
               if(names[i] != null){
                    System.out.println("Name:Role --> " + names[i] + ":" + roles[i]);
               }
          }
     }

}
