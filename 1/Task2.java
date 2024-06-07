public class Task2 {
     public static void main(String[] args){
          System.out.println("with third variable");
          int num1 = 9;
          int num2 = 10;
          System.out.println("Initially, the numbers are: " + num1 + ", " + num2);
          int temp = num1;
          num1 = num2;
          num2 = temp;
          System.out.println("After swap: " + num1 + ", " + num2 + "\n");


          System.out.println("Without third variable");
          int num3 = 17;
          int num4 = 90;
          System.out.println("Initially, the numbers are: " + num3 + ", " + num4);
          num3 += num4;
          num4 = num3 -num4;
          num3 -= num4;
          System.out.println("After swap: " + num3 + ", " + num4);


     }
}
