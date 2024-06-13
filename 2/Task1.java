public class Task1{
    public static void main(String[] args) {

        //a
        for(int i = 2; i <= 50; i += 4){
            if(i == 50){System.out.print(i); break;}
            System.out.print(i + ", ");
        }
        System.out.println();
        
        //b
        for(int i = 1, j = 2; i <= 120; j++){
            System.out.print(i);
            if(i != 120){System.out.print(", ");}
            i += j;
        }
        System.out.println();

    }
}