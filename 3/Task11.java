//Array Task5
import java.util.Scanner;
public class Task11 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("N = ");
          int N = sc.nextInt();
          int [] arr = new int[N];
          System.out.println("Please enter the elements of the array:");
          for(int i = 0; i < N; i++){
               arr[i] = sc.nextInt();
          }

          int count = N;
          int remov = 0;
          for(int i = 0; i < N; i++){
               while(i!= N-1 && arr[i] == arr[i+1]){
                    i++;
                    remov++;
                    count--;
               }
          }

          int[] new_arr = new int[count];
          for(int i = 0, j = 0; i < N; i++){
               
               while(i < N-1 && arr[i] == arr[i + 1]){
                    i++;
               }
               new_arr[j] = arr[i];
               j++;
          }
          
          System.out.print("New Array : ");
          for(int i = 0; i < count; i++){
               System.out.print(new_arr[i] + " ");
          }
          
          System.out.print("\nRemoved elements: " + remov);
          sc.close();
     }
}
