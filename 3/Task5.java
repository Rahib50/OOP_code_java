//String Task5
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words:");
        String inp1 = sc.nextLine();
        String inp2 = sc.nextLine();
        String concat = inp1 + " " + inp2;
        int len = concat.length();
        int sum = 0;
        for(int i = 0 ; i < len; i++){
            char current = concat.charAt(i);
            if(current >= 'A' && current <= 'Z' || current >= 'a' && current <= 'z'){
                sum += current;
            }
        }
        System.out.println(concat);
        System.out.println(sum);
        sc.close();
    }
}
