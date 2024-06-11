import java.util.Scanner;
public class Task1 {
  public static void main(String[] args) { 
    //A
    int num1 = 90;
    System.out.println(num1);
    
    System.out.println();
    //B
    int num2 = 80;
    num1 += num2;
    System.out.println("Sum: " + (num1));
    
    System.out.println();
    //C
    System.out.println("Product: " + (num1 * num2));
    System.out.println("division: " + (num1/num2));
    
    System.out.println();
    //D
    double num3 = 90;
    double num4 = 80;
    System.out.println(num3);
    
    num3 += num4;
    System.out.println("Sum with double: " + (num3));
    System.out.println("Product: " + (num3 * num4));
    System.out.println("Division: " + (num3 / num4));
    System.out.println();
    
    //E
    System.out.println("Sum with one double and one int: " + (num3 + num2));
    System.out.println("Product with one double and one int: " + (num3 * num2));
    System.out.println("Division with one double and one int: " + (num3 / num2));
    System.out.println();
    
    //F
    String num5 = "90";
    String num6 = "80";
    System.out.println(num5);
    
    System.out.println("Two Strings add: " + num5 + num6);
    System.out.println("String add to int: " + num5 + num2);
    System.out.println();
    
    //G
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input numbers: ");
    int my_num = sc.nextInt();
    int my_num2 = sc.nextInt();
    System.out.println(my_num);

    my_num += my_num2;
    System.out.println(my_num);
    sc.close();



    
  }  
}
