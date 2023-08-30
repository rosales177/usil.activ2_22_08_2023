package clases;

import interfaces.IShape;

public class Triangle extends GeometricFigure implements IShape {
  private Point point1;
  private Point point2;
  private Point point3;

  public Triangle() {
  }

  public Triangle(Point point1, Point point2, Point point3) {
      this.point1 = point1;
      this.point2 = point2;
      this.point3 = point3;
  }

  public Point getPoint1() {
      return point1;
  }

  public void setPoint1(Point point1) {
      this.point1 = point1;
  }

  public Point getPoint2() {
      return point2;
  }

  public void setPoint2(Point point2) {
      this.point2 = point2;
  }

  public Point getPoint3() {
      return point3;
  }

  public void setPoint3(Point point3) {
      this.point3 = point3;
  }
  

  @Override
  public double CalculateArea() {
      try{
          Double l1;
          Double l2;
          Double l3;
          Double h;
          
          l1 = point1.getDistance(point2);
          l2 = point2.getDistance(point3);
          l3 = point2.getDistance(point1);
          
          //Aplicando la formula de Heron 

          Double s = (l1 + l2 + l3) / 2;

          Double area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));

          return area;

      }catch(Exception e){
          return (double)0;
      }
  }

  public Double getPerimeter() {
    try{
        Double l1;
        Double l2;
        Double l3;
        
        l1 = point1.getDistance(point2);
        l2 = point2.getDistance(point3);
        l3 = point2.getDistance(point1);
        
        //Aplicando la formula de Heron
        
        Double s = (l1 + l2 + l3) / 2;
        
        Double perimeter = s * 3;
        
        return perimeter;
        
    }catch(Exception e){
        return (double)0;
    }
  }

  @Override
  public boolean isRegular() {
      Double l1;
      Double l2;
      Double l3;
      
      l1 = point1.getDistance(point2);
      l2 = point2.getDistance(point3);
      l3 = point2.getDistance(point1);    
      
      if(l1 == l2 && l2 == l3 && l3 == l1)
      {
          return true;
      }else{
          return false;
      }
              
  }

  public String toString(){
      return "Triangle: "+ getName() +"\nPuntos: "+ getPoint1().toString() +","+ getPoint2().toString() + "," + getPoint3().toString() + "\nArea: " + CalculateArea() + "\nRegular: " + (isRegular()==true?"Es regular":"No es regular");
  }
}
