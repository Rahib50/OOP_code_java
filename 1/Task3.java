import java.util.Scanner;
public class Task3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your ID: ");
          int id = sc.nextInt();
          System.out.println(id % 10);
          System.out.println((id % 100)/10);

          sc.close();
     }
}
