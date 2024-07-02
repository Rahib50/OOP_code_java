//Array Task2

import java.util.Scanner;
public class Task8 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int[] arr = new int[5];
          for(int idx = 0; idx < 5; idx++){
               arr[idx] = sc.nextInt();
          }
          
          int min = 0; int max = 0; int min_idx = 0; int max_idx = 0;
          for(int i = 0; i < 5; i++){
               if(i == 0){
                    min = arr[i];
                    min_idx = i;
               }
               
               else{
                    if(min > arr[i]){
                         min = arr[i];
                         min_idx = i;
                    }
                    if(max < arr[i]){
                         max = arr[i];
                         max_idx = i; 
                    }
               }

          }
          System.out.println("The largest number " +max + " was found at location " + max_idx);
          System.out.println("The smallest number " + min + " was found at location " + min_idx);

          sc.close();
     }
}
