package clases.figure;

import java.lang.reflect.Array;

import clases.base.Point;
import clases.base.Quadrilateral;
import interfaces.IShape;

public class Rectangle extends Quadrilateral implements IShape{

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Rectangle(String name, Point p1, Point p2, Point p3, Point p4) {
        super(name, p1, p2, p3, p4);

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;

        
        
        if(!this.isRegular()){
            System.out.println("El cuadrilatero no es regular"); 
        }
        
    }

    private double[] getSides(){
        Double l1 = p1.getDistance(p2);
        Double l2 = p2.getDistance(p3);
        Double l3 = p3.getDistance(p4);
        Double l4 = p4.getDistance(p1);
        
        return new double[] {l1,l2,l3,l4};
    }

    @Override
    public double CalculateArea(){

        //formula de Brahmagupta
        double[] sides = getSides();

        Double s = (sides[0]+sides[1]+sides[2]+sides[3]) / 2.0;

        Double area = Math.sqrt((s-sides[0])*(s-sides[1])*(s-sides[2])*(s-sides[3]));

        return area;

    }

    @Override
    public String toString(){
        return "El rectángulo: {" + 
            "\n\tNombre : " +this.getName() + 
            "\n\tVertice 1: (" + this.p1.getX() + "," + this.p1.getY() + ")," + 
            "\n\tVertice 2: (" + this.p2.getX() + "," + this.p2.getY() + ")," + 
            "\n\tVertice 3: (" + this.p3.getX() + "," + this.p3.getY() + ")," + 
            "\n\tVertice 4: (" + this.p4.getX() + "," + this.p4.getY() + ")," +
            "\n\tÁrea: " + this.CalculateArea() +
            "\n}";
    }


    public Double getPerimeter(){
        double[] sides = getSides();
        Double perimeter = (double)0;
        for(int i = 0; i < sides.length; i++ ){
            perimeter += sides[i];
        }
        return perimeter;
    }
    
}
