package clases.figure;

import clases.GeometricFigure;
import clases.Point;

public class Circle extends GeometricFigure {
    private Point center;
    private int radius;


    public Circle(String name, Point center, int radius){
        super(name);

        this.center = center;
        this.radius = radius;
    }

    @Override
    public double CalculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public boolean isRegular(){
        return true;
    }

    @Override
    public String toString(){
        return "Circle: " + name + ", center: " + center + ", radius: " + radius;
    }


}
