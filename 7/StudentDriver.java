public class StudentDriver {
     public static void main(String[] args){
          System.out.println("-----------------");
          Student student1 = new Student(12345678);
          student1.addCourse("CSE110");
          student1.setCG(2.5);
          student1.addCourse("CSE110");
          student1.addCourse("ENG101");
          student1.showAdvisee();
          System.out.println("-----------------");
          student1.rmAllCourse();
          student1.showAdvisee();
          System.out.println("-----------------");
          student1.setID(54652365);
          String[] courses = {"SOC101","CSE111","ENG102"};
          student1.addCourse(courses);
          student1.showAdvisee();
          System.out.println("-----------------");
          student1.addCourse("CSE230");
          student1.showAdvisee();
          System.out.println("-----------------");
          Student student2 = new Student(975738383,3.7);
          String[] courses2 = {"CSE220","PHY112","MAT120","BUS101","CHN101"};
          student2.addCourse(courses2);
          student2.showAdvisee();
        }      
}

//Task7

class Student{
     private double cg;
     private int id;
     private String[] courses;
     private int count;
     private int my_total_courses;

     public Student(int num){
          setID(num);
     }

     public Student(int id, double cg){
          setID(id);
          setCG(cg);
     }

     public void setCG(double cg){
          this.cg = cg;
          if(cg >= 3){
               courses = new String[4];
               my_total_courses = 4;
          }
          else{
               courses = new String[3];
               my_total_courses = 3;
          }
     }

     public void setID(int x){
          this.id = x;
     }

     public void addCourse(String x){
          if(this.cg == 0){
               System.out.println("Failed to add " + x);
               System.out.println("Set CG first");
          }
          else{
               boolean flag = false;
               for (int i = 0; i < my_total_courses; i++){
                    if(courses[i] == null){
                         courses[i] = x;
                         flag = true;
                         count++;
                         break;
                    }
               }
               if(!flag){
                    System.out.println("Failed to add " + x);
                    if(this.cg >= 3){
                         System.out.println("Maximum 4 courses allowed.");
                    }
                    else{
                         System.out.println("CG is low. Can't add more than 3 courses.");
                    }
               }
          }     
     }

     public void addCourse(String[] x){
          
          for(int j = 0; j< x.length; j++){
               if(this.cg == 0){
                    System.out.println("Failed to add " + x[j]);
                    System.out.println("Set CG first");
               }
               boolean flag = false;
               for (int i = 0; i < my_total_courses && cg > 0; i++){
                    if(courses[i] == null){
                         courses[i] = x[j];
                         flag = true;
                         count++;
                         break;
                    }
               }
               if(!flag){
                    System.out.println("Failed to add " + x[j]);
                    if(this.cg >= 3){
                         System.out.println("Maximum 4 courses allowed.");
                    }
                    else{
                         System.out.println("CG is low. Can't add more than 3 courses.");
                    }
               }
          }
  
     }

     public void rmAllCourse(){
          for(int i = 0; i < courses.length; i++){
               courses[i] = null;
          }
          count = 0;
     }

     public void showAdvisee(){
          double cg = this.cg;
          int ID = this.id;
          System.out.println("Student ID: " + ID + ", CGPA: " + cg);
          boolean flag = false;
          if(count > 0){
               System.out.println("Added courses are: ");
               for(int i = 0; i < my_total_courses; i++){
                    if(courses[i] != null){
                         System.out.print(courses[i] + " ");
                         flag = true;
                    }
               
               }
               System.out.println();
          }
          if(!flag){
               System.out.println("No courses added.");
          }
     }
     

}
