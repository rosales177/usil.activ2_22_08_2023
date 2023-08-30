import clases.Point;
import clases.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Triangle t = new Triangle(new Point(0,0), new Point(6,0), new Point(3,5));
        t.setName("Equilatero");
        System.out.println(t.toString());
        
    }
}
