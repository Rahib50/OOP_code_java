import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int up = sc.nextInt();
        
        int count = 0;
        for(int i = low; i <= up; i++){
            boolean flag = true;
            for(int j = 2; j < i; j++){
                if(i % j ==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
            }
        }
        System.out.println("There are " + count + " numbers between " + up + " and " + low);
        sc.close();
    }
}
