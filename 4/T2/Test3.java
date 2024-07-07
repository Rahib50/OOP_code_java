//Task3 
public class Test3 {
    public static void main(String[] args) {
        Circle ball = new Circle();
        double pi = Math.PI;
        System.out.println("Radius of the circle is " + ball.radius);
        System.out.println("The area of the circle is " + pi * (ball.radius* ball.radius));
        System.out.println("The circumference of the circle is " + pi * (2 * ball.radius));
    }
}
