import java.util.Scanner;
public class Task6 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter year: ");
          int year = sc.nextInt();
          boolean leap = false;
          if(year % 4 == 0){
              leap = true;
          }
          if(year %100 == 0 && year %400 != 0){
               leap = false;
          }

          if(leap){System.out.println(year + " is a leap year");}
          else{System.out.println(year + " is not a leap year");}
          
          sc.close();
     }
}
