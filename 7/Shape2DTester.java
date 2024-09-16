//dsfladf
public class Shape2DTester {
    public static void main(String[] args) {
        Shape2D sq = new Shape2D(5);
        System.out.println("---------1----------");
        sq.area();
        System.out.println("---------2----------");
        Shape2D rectangle = new Shape2D(5,6);
        System.out.println("---------3----------");
        rectangle.area();
        System.out.println("---------4----------");
        Shape2D tri1 = new Shape2D(5,6,"Triangle");
        System.out.println("---------5----------");
        tri1.area();
        System.out.println("---------6----------");
        Shape2D tri2 = new Shape2D(5,6,7);
        System.out.println("---------7----------");
        tri2.area();
        System.out.println("---------8----------");
    }
}

//Task 4

class Shape2D{
    String name;
    double len;
    double wid;
    double hei;
    double x;
    double y;
    double z;
    double area;

    //SQUARE
    public Shape2D(double len){
        this.name = "Square";
        this.len = len;
        this.area = len * len;
        System.out.println("A Square has been created with length: " + (int)len);
    }

    //RECTANGLE
    public Shape2D(double len, double wid){
        this.name = "Rectangle";
        this.len = len;
        this.wid = wid;
        this.area = len * wid;
        System.out.println("A Rectangle has been created with length: " + (int)len + " and breadth: " + (int)wid);
    }

    //TRIANGLE WITH BASE AND HEIGHT INPUT
    public Shape2D(double hei, double len, String name){
        this.name = name;
        this.len = len;
        this.hei = hei;
        this.area = 0.5 * len * hei;
        System.out.println("A Triangle has been created with height: " + (int)hei + " and base: " + (int)len);
    }

    //TRIANGLE WITH THREE SIDES INPUT
    public Shape2D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;

        System.out.println("A Triangle has been created with the following sides: " + (int)x + ", " + (int)y + ", " + (int)z);
        double s = (x + y + z)/2.0;
        area = Math.sqrt(s * (s-x) * (s-y) * (s-z)); 
    }

    //PRE-CALCULATED AREA
    public void area(){
        System.out.println("The area of the " + name + " is: " + area);
    }


}