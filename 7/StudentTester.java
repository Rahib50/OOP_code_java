public class StudentTester{
    public static void main(String[] args){
        Student s1 = new Student("Harry", "CSE");
        System.out.println(s1.name);
        s1.updateName("Harry Potter");
        System.out.println(s1.accessName());
        System.out.println(s1.prog);
        s1.updateProgram("CS");
        String prog = s1.accessProgram();
        System.out.println(prog);
    }
}


//Task1
class Student{
    public String name;
    public String prog;
    public Student(String name, String prog){
        this.name = name;
        this.prog = prog;
    }

    public void updateName(String name){
        this.name = name;
    }

    public String accessName(){
        String nam = this.name;
        return nam;

    }

    public String accessProgram(){
        String program = prog;
        return program;
    }

    public void updateProgram(String prog){
        this.prog = prog;
    }

}

