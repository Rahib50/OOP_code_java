import java.util.Scanner;
public class Task11 {
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of x: ");
    int x = sc.nextInt();
    if(x < 0){System.out.println(2 * x);}
    if(x >= 0 && x < 2){System.out.println(x + 1);}
    if(x >= 2 && x < 5){System.out.println((x * x) -1);}
    if(x >= 5){System.out.println((3 * x * x) + 2);}
    sc.close();
  }
}
