import java.util.Scanner;
public class Task5 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double count = 0;
          int zero_count = 0;
          int inp = 0;
          int max = 0;
          int min = 0;
          int sum = 0;
          while (zero_count != 3){
               inp = sc.nextInt();
               if(inp != 0){
                    if(count == 0){
                         min = inp;
                    }
                    if(max < inp){
                         max = inp;
                    }
                    if (min > inp){
                         min = inp;
                    }
                    sum += inp;
                    count++;
                    zero_count = 0;
               }
               else{
                    zero_count++;
               }
          }
          if(zero_count == 3){
               count = 1; //To make sure the Average is not a math error
          }

          // System.out.println(count);
          System.out.println( "Sum = " + sum);
          System.out.println( "Minimum = " + min);
          System.out.println( "Maximum = " + max);
          System.out.println( "Average = " + (sum/count));
          sc.close();
     }
}
