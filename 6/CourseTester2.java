public class CourseTester2 {
     public static void main(String [] args){
          Course2 c1 = new Course2();
          c1.createCourse("PL II", "CS11");
          System.out.println("--------1--------");
          c1.printDetails();
          System.out.println("--------2--------");
          c1.addContent("Overloading");
          c1.printDetails();
          System.out.println("--------3--------");
          c1.addContent("Encapsulation");
          c1.addContent("Static", "Polymorphism");
          c1.printDetails();
          System.out.println("--------4--------");
          c1.addContent("Inheritance");
          System.out.println("--------5--------");
          Course2 c2 = new Course2();
          c2.createCourse("DS", "CS22");
          c2.addContent("Stack");
          c2.addContent("Recursion","Tree");
          c2.addContent("Heap","Hashing");
          System.out.println("--------6--------");
          c2.printDetails();
        }      
}

//Task 7

/* The method addContent can take one parameter as well as two parameter 
unlike task 6 where addOneContent and addTwoContent needed to be used separately. 
(method overloading used) */

class Course2{
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
  
          for(int i = 0; i < syll.length; i++){
              if(!(syll[i] == " ")){
                  System.out.print(syll[i]);
                  if(i < syll.length-1){
                      System.out.print(", ");
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

     public void addContent(String cont){
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

     public void addContent(String cont1, String cont2){
          addContent(cont1);
          addContent(cont2);
     }

}


