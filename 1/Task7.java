import java.util.Scanner;
public class Task7 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter number: ");
          int inp = sc.nextInt();
          if((inp % 5 == 0) && (inp % 7 == 0)){
               System.out.println("Divisible by Both");
          }
          else if(!(inp % 5 == 0) && (inp % 7 == 0)){
               System.out.println("Invalid: Divisible by 7 Only");
          }
          else if((inp % 5 == 0) && !(inp % 7 == 0)){
               System.out.println("Invalid: Divisible by 5 Only");
          }
          else{
               System.out.println("No");
          }

          sc.close();

     }
}
