package clases.figure;

import clases.Point;

public class Rectangle extends Quadrilateral{

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
            throw new IllegalArgumentException("El rectángulo no es regular");
        }
        
    }

    @Override
    public double CalculateArea(){

        //formula de Brahmagupta

        Double l1 = p1.getDistance(p2);
        Double l2 = p2.getDistance(p3);
        Double l3 = p3.getDistance(p4);
        Double l4 = p4.getDistance(p1);

        Double s = (l1+l2+l3+l4) / 2.0;

        Double area = Math.sqrt((s-l1)*(s-l2)*(s-l3)*(s-l4));

        return area;

    }

    @Override
    public String toString(){
        return "El rectángulo: " + this.getName() + 
            "{\np1: " + this.p1 + "\n,p2: " + this.p2 + "\n,p3: " + this.p3+",\np4: " + this.p4 ;
    }
    
}
