//Array Task6
import java.util.Scanner;
public class Task12 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Number of elements: ");
          int len = sc.nextInt();
          int[] arr = new int[len];
          for(int i = 0; i < len; i++){
               arr[i] = sc.nextInt();

          }

          //sorting
          for(int i = 0; i < len; i++){
               for(int j = 0; j < len -1; j++){
                    if(arr[j] > arr[j + 1]){
                         int temp = arr[j];
                         arr[j] = arr[j + 1];
                         arr[j + 1] = temp;
                    }

               }
          }
          double median = 0;
          if(len % 2 != 0){
               median = arr[(len-1)/2];
          }
          if(len % 2 == 0){
               median = (arr[len/2] + arr[len/2 - 1])/2.0;
          }
          System.out.println("The median is " + median);

          sc.close();
     }
}
