//revisit to fix
//String Task6
public class Task6 {
    public static void main(String[] args) {
        String s1 = "ABBCCCCCBBAB";

        String out = "";
        int len = s1.length();
        for(int i = 0; i < len; i++){
            char current = s1.charAt(i);
            out += current;
            while(i != len-1 && current == s1.charAt(i + 1)){
                i++;
            }
        }
        System.out.println(out);

        out = "";
        s1 = "AAABBBBCDDBBECE";
        len = s1.length();
        for(int i = 0; i < len; i++){
            char current = s1.charAt(i);
            out += current;
            while(i != len-1 && current == s1.charAt(i + 1)){
                i++;
            }
        }
        System.out.println(out);
        
    }
}
