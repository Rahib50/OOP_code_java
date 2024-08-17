public class Course {
    public String cName;
    public String code;
    public int credit;
    // Write your code here

    public void displayCourse(){
        System.out.println("Course Name: " + this.cName);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course Credit: " + this.credit);       
    }

    public void createCourse(String name, String code, int credit){
        this.cName = name;
        this.code = code;
        this.credit = credit;
    }

    public void updateCourse(String name, String code, int credit){
        this.cName = name;
        this.code = code;
        this.credit = credit;
    }
     
}
