//String Task3
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String new_string = "";
        int len = inp.length();
        for(int i = 0; i < len; i++){
            new_string += inp.charAt(i);
            System.out.println(new_string);
        }
        sc.close();
    }
}
