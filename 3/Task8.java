//Array Task2

import java.util.Scanner;
public class Task8 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int arr[] = {7,13,2,10,6};
          
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
          System.out.println("The number largest " +max + " was found at location " + max_idx);
          System.out.println("The number smallest " + min + " was found at location " + min_idx);


          int arr2[] = {2, 4, -5, 12, 3};
          min = 0; max = 0; min_idx = 0; max_idx = 0;
          for(int i = 0; i < 5; i++){
               if(i == 0){
                    min = arr2[i];
                    min_idx = i;
               }
               
               else{
                    if(min > arr2[i]){
                         min = arr2[i];
                         min_idx = i;
                    }
                    if(max < arr2[i]){
                         max = arr2[i];
                         max_idx = i; 
                    }
               }

          }
          System.out.println("The number largest " +max + " was found at location " + max_idx);
          System.out.println("The number smallest " + min + " was found at location " + min_idx);

          sc.close();
     }
}
