//String Task1
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String new_str = "";
        int len = inp.length();
        for(int i = len-1; i >= 0; i--){
            new_str += inp.charAt(i);
        }
        if(inp.equals(new_str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
