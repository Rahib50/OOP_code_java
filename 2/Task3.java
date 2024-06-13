import java.util.Scanner;
public class Task3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int inp;
          int max = 0;
          int min = 0;
          int sum = 0;
          double count = 10;
          for(int i = 0; i < 10; i++){
               inp = sc.nextInt();
               sum += inp;
               if(i == 0){ 
                    max = inp; min = inp;
               }
               else{
                    if(max < inp){
                         max = inp;
                    }
                    if(min > inp){
                         min = inp;
                    }
               }
               
          }
          System.out.println("Sum = " + sum);
          System.out.println("Minimum = " + min);
          System.out.println("Maximum = " + max);
          System.out.println("Average = " + sum/count);

          sc.close();
     }
}
