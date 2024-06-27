//Array Task3
import java.util.Scanner;
public class Task9 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the length of the array: ");
          int len = sc.nextInt();
          int[] arr = new int[len]; 
          for(int i = 0; i < len; i++){
               arr[i] = sc.nextInt();
          }

          for(int i = 0, j = len-1; i< len/2; i++, j--){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
          }
          System.out.println();
          for(int i = 0; i < len; i++){
               System.out.print(arr[i] + " ");
          }

          sc.close();
     }
}
