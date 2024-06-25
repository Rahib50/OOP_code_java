import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("All fibonacci present until: ");
        int inp = sc.nextInt();
        int prev = 0, term = 1; //previous term and preset term

        //a
        while(term <= inp){
            System.out.print(term + " ");
            int temp = term;
            term += prev;
            prev = temp;
        }
        System.out.println();

        //b
        prev = 0; term = 1;
        int sum = 0;
        while(term <= inp){
            sum += term;
            int temp = term;
            term += prev;
            prev = temp;
        }
        System.out.println("Sum = " + sum);


        sc.close();
    }
}
