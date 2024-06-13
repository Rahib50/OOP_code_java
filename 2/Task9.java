import java.util.Scanner;
public class Task9 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          //A
          int num = sc.nextInt();
          
          int count = 0;
          while (num != 0){
               num /= 10;
               count++;
          }
          System.out.println(count + " digits");

          //B
          int num1 = sc.nextInt();
          int num2 = num1;
          count = 0;
          while (num1 != 0){
               num1 /= 10;
               count++;
          }
          while (count != 0){
               int div = (int)Math.pow(10, count-1);
               int result = (num2/div % 10) * 7;
               System.out.print(result + " ");
               count--;
          }

          sc.close();
     }
}
