//(SHOULD BE FIXED ACCORDING TO SOME TESTS)
//String Task4
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true){
            String uniq = "";
            String inp = sc.nextLine();
            
            boolean flag = true;
            int count = 1; //repeat counter
            
            for(int i = 0; i <= inp.length()-1; i++){
                char current = inp.charAt(i);
                boolean new_letter = true;
                for(int j = 0; j < uniq.length(); j++){
                    if(uniq.charAt(j) == current){
                        new_letter = false;
                    }
                }
                if(new_letter){
                    uniq += current;
                    for(int k = 0; k < inp.length(); k++){
                        if(i != k && current == inp.charAt(k)){
                            flag = false;
                            count++;
                        }
                    }
                }
                
                if(count > 1 && new_letter){
                    System.out.println("\""+ current + "\" has been counted " + count + " times in the word " + "\"" + inp + "\"");
                    count = 1;
                }
            }
            
            if(flag){
                System.out.println("You entered " + inp);
                break;
            }
            else{
                System.out.println("Please enter another word");
            }
        }
        sc.close();
    }
}
