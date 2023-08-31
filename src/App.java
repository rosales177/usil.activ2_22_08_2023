import clases.base.Point;
import clases.figure.Circle;
import clases.figure.Rectangle;
import clases.figure.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Triangle t = new Triangle(new Point(0,0), new Point(6,0), new Point(3,5));
        t.setName("Equilatero");
        System.out.println(t.toString());

        Rectangle rectangle = new Rectangle("Trapecio", new Point(0,0), new Point(12,0), new Point(10,4), new Point(2,4));
        System.out.println(rectangle.toString());

        Circle circle = new Circle("Circulo", new Point(0, 0), 4);
        System.out.println(circle.toString());
        
    }
}
