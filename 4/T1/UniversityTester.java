//Task1
public class UniversityTester {
    public static void main(String[] args){
        //a
        University first = new University();
        University second = new University();

        System.out.println(first);
        System.out.println(second);
        //The locations are different

        //b
        first.name = "Imperial College London";
        first.country = "England";

        second.name = "Brac University";
        second.country = "Bangladesh";

        System.out.println(first.country);
        System.out.println(second.country);

        System.out.println(first.name);
        System.out.println(second.name);

        //ASK WHAT OBJECTS ARE SAME VALUE MEAN 

    }
}