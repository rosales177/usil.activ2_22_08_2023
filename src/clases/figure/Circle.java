package clases.figure;

import clases.base.GeometricFigure;
import clases.base.Point;
import interfaces.IShape;

public class Circle extends GeometricFigure implements IShape {
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
        return "Circle: {" + 
        "\n\tNombre: " + name + 
        "\n\tCentro: " + center + 
        "\n\tRadio: " + radius + 
        "\n\tArea: " + this.CalculateArea() +
        "\n}";
    }


    public Double getPerimeter(){
        return (2*Math.PI) * this.radius;
    }

}
