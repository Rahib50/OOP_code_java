import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        int money = sc.nextInt();
        
        int c500 = 0;
        int c100 = 0;
        int c50 = 0;
        int c10 = 0;
        int c5 = 0;
        int c1 = 0;

        while (money >= 500){
            money -= 500;
            c500++;
        }
        

        while(money >= 100){
            money -= 100;
            c100++;
        }
        
        
        while(money >= 50){
            money -= 50;
            c50++;
        }
       

        while(money >= 10){
            money -= 10;
            c10++;
        }
        

        while(money >= 5){
            money -= 5;
            c5++;
        }

        c1 = money;


        if (c500 > 0){System.out.println(c500 + " 500's note");}
        if (c100 > 0){System.out.println(c100 + " 100's note");}
        if (c50 > 0){System.out.println(c50 + " 50's note");}
        if (c10 > 0){System.out.println(c10 + " 10's note");}
        if (c5 > 0){System.out.println(c5 + " 5's note");}
        if (c1 > 0){System.out.println(c1 + " 1's note");}
        

        sc.close();

    }
}
