public class Task2 {
     public static void main(String[] args) {
          for(int i = 2; i < 20; i+=2){
               System.out.print(i);
               if(i != 20){System.out.print(", ");}
          }
          for(int j = 20; j >= 2; j-= 2){
               System.out.print(j);
               if(j != 2){System.out.print(", ");}
          }
     }
}
