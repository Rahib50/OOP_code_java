public class ShapeTester {
     public static void main(String args []){
          Shape circle = new Shape();
          Shape triangle = new Shape();
          Shape trapezium = new Shape();
          
          circle.setParameters("Circle", 5);
          triangle.setParameters("Triangle", 4, 7);
          trapezium.setParameters("Trapezium", 2, 4, 9);
          
          System.out.println(circle.details());
          System.out.println("---------------");
          System.out.println(triangle.details());
          System.out.println("---------------");
          System.out.println(trapezium.details());  
     }   
}

class Shape{
     String name;
     double area;
     
     public void setParameters(String circ, double r){
          name = circ;
          area = 3.14159 * r * r;
     }

     public void setParameters(String tri, double b, double h){
          name = tri;
          area = 0.5 * b * h;
     }

     public void setParameters(String trap, double a, double b, double c){
          name = trap;
          area = 0.5 * (a + b) * c;
     }

     public String details(){
          return ("Shape Name: " + name + "\nArea: " + area);
     }

}
