//Array Task 1
import java.util.Scanner;
public class Task7 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("N = ");
          int N = sc.nextInt();
          int len = N;
          int[] arr = new int[N];
          for(int i = 0; i < N; i++){
               arr[i] = sc.nextInt();
          }
          System.out.print("Remove Element = ");
          int rem = sc.nextInt();
          boolean found = false;
          
          System.out.println("Input array:");
          for(int i = 0; i < N; i++){
               System.out.print(arr[i] + " ");
          }
          System.out.println();

          for(int i = 0; i < N; i++){
               if(arr[i] == rem){
                    len--;
                    found = true;
               }
          }

          int[] new_arr = new int[len];
          if(found){
               
               for(int i = 0, j = 0; i < N; i++){
                    if(arr[i] != rem){
                         new_arr[j] = arr[i];
                         j++;
                    }
               }
               System.out.println("New array:");
               for(int i = 0; i < len; i++){
                    System.out.print(new_arr[i] + " ");
               }
               System.out.println();
          }
          else{
               System.out.println("Element not found");
          }

          sc.close();
     }
}
