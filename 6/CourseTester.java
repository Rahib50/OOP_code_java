//Task 6 *****
public class CourseTester {
    public static void main(String [] args){
        Course c1 = new Course();
        c1.createCourse("PL II", "CS11");
        System.out.println("--------1--------");
        c1.printDetails();
        System.out.println("--------2--------");
        c1.addOneContent("Overloading");
        c1.printDetails();
        System.out.println("--------3--------");
        c1.addOneContent("Encapsulation");
        c1.addTwoContent("Static", "Polymorphism");
        c1.printDetails();
        System.out.println("--------4--------");
        c1.addOneContent("Inheritance");
        System.out.println("--------5--------");
        Course c2 = new Course();
        c2.createCourse("DS", "CS22");
        c2.addOneContent("Stack");
        c2.addTwoContent("Recursion","Tree");
        c2.addTwoContent("Heap","Hashing");
        System.out.println("--------6--------");
        c2.printDetails();
      }    
}

//Task 6
class Course{
    String code;
    String course_name;
    String[] syll = {" ", " ", " ", " "};

    public void createCourse(String name , String code){
        this.code = code;
        course_name = name;
    }

    public void printDetails(){
        System.out.println("Course details: ");
        System.out.println("Course Name: " + course_name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Syllabus: ");

        boolean flag = false;

        for(int i = 0; i < syll.length-1; i++){
            if(!(syll[i] == " ")){
                if(i==0){
                    System.out.print(syll[i]);
                }
                else{
                    System.out.print(", "+syll[i]);
                }
                
                flag = true;
            }
            
            
        }
        if(flag){
            System.out.println();
        }

        else{
            System.out.println("No content yet.");
        }

    }

    public void addOneContent(String cont){
        boolean flag = false;
        for(int i = 0; i < syll.length; i++){
            if(syll[i].equals(" ")){
                syll[i] = cont;
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("Cannot add more content");
        }
        else{
            System.out.println(cont + " was added.");
        }
    }

    public void addTwoContent(String a, String b){
        addOneContent(a);
        addOneContent(b);
    }
    
}
