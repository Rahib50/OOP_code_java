//Array Task4
import java.util.Scanner;
public class Task10 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("N =");
          int N = sc.nextInt();
          int[] arr = new int[N];
          
          for(int i = 0; i < N; i++){
               arr[i] = sc.nextInt();
          }

          for(int i = 0; i < N; i++){
               int count = 1;
               int current = arr[i];
               boolean flag = true;
               for(int j = 0; j < i; j++){
                    if(current == arr[j]){
                         flag = false;
                    }
               }
               if(flag){
                    for(int k = 0; k < N; k++){
                         if(current == arr[k] && k != i){
                              count++;
                         }
                    }
                    System.out.println(current + " - " + count + " times");
               }  
          }

          sc.close();
     }
}
