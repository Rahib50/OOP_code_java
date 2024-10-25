public class StudentTester {
     public static void main(String[] args) {
          Student.printDetails();
          System.out.println("--------------------");
          Student mikasa = new Student("Mikasa", 3.75);
          mikasa.individualDetail();
          System.out.println("--------------------");
          Student.printDetails();
          System.out.println("--------------------");
          Student harry = Student.createStudent("Harry", 2.5, "Charms");
          harry.individualDetail();
          System.out.println("--------------------");
          Student.printDetails();
          System.out.println("--------------------");
          Student levi = new Student("Levi", 3.33);
          levi.individualDetail();
          System.out.println("--------------------");
          Student.printDetails();
     }
}

// TASK3
class Student {
     public static int total_stu;
     public static int cse_stu;
     public static int other_stu;

     public double cg;
     public String name;
     String dep = "CSE";
     int id;

     public Student(String name, double cgpa) {
          this.name = name;
          cg = cgpa;
          total_stu++;
          id = total_stu;
          cse_stu++;
     }

     public Student(String name, double cgpa, String dep) {
          this.name = name;
          cg = cgpa;
          total_stu++;
          other_stu++;
          id = total_stu;

     }

     public static Student createStudent(String nam, double cgpa, String dep) {
          Student x = new Student(nam, cgpa, dep);
          return x;
     }

     public static void printDetails() {
          System.out.println("Total Student(s): " + total_stu);
          System.out.println("CSE Student(s): " + cse_stu);
          System.out.println("Other Department Student(s): " + other_stu);
     }

     public void individualDetail() {
          System.out.println("ID: " + id);
          System.out.println("Name: " + name);
          System.out.println("CGPA: " + cg);
          System.out.println("Department: " + dep);
     }

}