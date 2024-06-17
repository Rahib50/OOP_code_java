import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, max = 0;
        int inp;
        int min = 0;
        double count = 0;
        for(int i = 0; i < 10; i++){
            inp = sc.nextInt();
            if(inp >0 && inp %2 != 0){
                if(i == 0){
                    min = inp;
                }
                if(max < inp){
                    max = inp;
                }
                if(min > inp){
                    min = inp;
                }
                total += inp;
                count++;
            }

        }
        if(count == 0){
            System.out.println("No odd positive numbers found");
        }
        else{
            System.out.println("Sum"+ " = " + total);
            System.out.println("Minimum"+ " = " + min);
            System.out.println("Maximum"+ " = " + max);
            System.out.println("Average"+ " = " + (total/count));
        }

        sc.close();

    }
}
