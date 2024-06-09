import java.util.Scanner;
public class Task9 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("CGPA out of 4: ");
          double cg = sc.nextDouble();
          System.out.print("credits: ");
          int cred = sc.nextInt();

          if(cred >= 30 && cg <= 4){
               if(cg >= 3.8 && cg <= 3.89){
                    System.out.println("Eligible for a waiver of 25 percent");
               }
               else if(cg >= 3.9 && cg <= 3.94){
                    System.out.println("Eligible for a waiver of 50 percent");
               }
               else if(cg >= 3.95 && cg <= 3.99){
                    System.out.println("Eligible for a waiver of 75 percent");
               }
               else if(cg > 3.99){
                    System.out.println("Eligible for a waiver of 100 percent");
               }
               else{
                    System.out.println("Not eligible for a waiver");
               }

          }
          else{
               System.out.println("Not eligible for a waiver");
          }

          sc.close();
     }
}
