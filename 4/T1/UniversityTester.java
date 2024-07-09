//Task1
public class UniversityTester {
    public static void main(String[] args){
        //a
        University first = new University();
        University second = new University();

        System.out.println(first);
        System.out.println(second);
        if(first.equals(second)){
            System.out.println("They are equal");

        }
        else{
            System.out.println("They are not equal");
        }

        //b
        String New_name = first.name;
        String New_country = first.country;

        first.name = "Imperial College London";
        first.country = "England";

        if(New_country.equals(first.country) && New_name.equals(first.name)){
            System.out.println("First object has not changed");
        }
        else{
            System.out.println("First object has changed");
        }

        New_name = second.name;
        New_country = second.country;

        second.name = "Brac University";
        second.country = "Bangladesh";

        if(New_country.equals(first.country) && New_name.equals(first.name)){
            System.out.println("Second object has not changed");
        }
        else{
            System.out.println("Second object has changed");
        }

        System.out.println(first.country);
        System.out.println(second.country);
        

        System.out.println(first.name);
        System.out.println(second.name);
        if(first.country.equals(second.country) && first.name.equals(second.name)){
            System.out.println("They are the same value");

        }
        else{
            System.out.println("They do not have the same value");
        }
    }
}