//String Task2
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of small letters: ");
        String inp = sc.nextLine();
        int len = inp.length();
        String new_string = "";
        for(int i = 0; i < len; i++){
            char chr = inp.charAt(i);
            if(chr == 'a'){
                new_string += 'z';
            }
            else{
                chr -= 1;
                new_string += chr;
            }
        }
        System.out.println(new_string);
        sc.close();
    }
}
