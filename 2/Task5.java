import java.util.Scanner;
public class Task5 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double count = 1;
          int zero_count = 0;
          int inp = sc.nextInt();
          int max = inp;
          int min = inp;
          int sum = inp;
          while (zero_count != 3){
               inp = sc.nextInt();
               if(inp != 0){
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

          System.out.println( "Sum = " + sum);
          System.out.println( "Minimum = " + min);
          System.out.println( "Maximum = " + max);
          System.out.println( "Average = " + (sum/count));
          sc.close();
     }
}
