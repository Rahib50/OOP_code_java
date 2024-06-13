import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();

        //a
        for(int i = 0; i < inp; i++){
            for(int j = 0; j < inp; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //b
        int row = 1;
        for(int col = 0; col < inp; col++){
            for(int j = 0; j < row; j++){
                System.out.print("*");
            }
            row++;
            System.out.println();
        }

        sc.close();
    }
}
