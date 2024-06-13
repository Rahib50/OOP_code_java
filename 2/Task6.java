import java.util.Scanner;
public class Task6 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double w_sum = 0;
          double prod = 0;
          for (int i = 0; i < 5; i++){
               double num = sc.nextDouble();
               double w = sc.nextDouble();

               w_sum += w;
               prod += w * num;
          }

          double W = prod/w_sum;
          System.out.println("Weighted Average = " + W);
          sc.close();
     }
}
