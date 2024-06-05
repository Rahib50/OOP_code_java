import java.util.Scanner;
public class Task8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ID: ");
    int id = sc.nextInt();
    int year = id/1000000;
    int session = (id/100000) % year;
    
    if (session == 1){System.out.println("Student Joined BRAC in Spring " + year);}
    if (session == 2){System.out.println("Student Joined BRAC in Fall " + year);}
    if (session == 3){System.out.println("Student Joined BRAC in Summer " + year);}
    sc.close();
  }  
}
