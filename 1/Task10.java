import java.util.Scanner;
public class Task10 {
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int inp = sc.nextInt();
    if((inp % 5==0) && (inp%2==0)){
      System.out.println("Multiple of 2 and 5 both");
    }
    if((inp % 5 == 0) && !(inp%2==0)){
      System.out.println(inp);
    }
    if(!(inp % 5==0) && (inp%2==0)){
      System.out.println(inp);
    }
    else{System.out.println("Not a multiple we want");}
    sc.close();
  }
}
