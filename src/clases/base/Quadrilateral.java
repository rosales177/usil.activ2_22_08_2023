package clases.base;

public abstract class Quadrilateral extends GeometricFigure{

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Quadrilateral(String name, Point p1, Point p2, Point p3, Point p4) {
        super(name);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }


    @Override
    public  boolean isRegular() {
        return checkRectangular(this.p1, this.p2, this.p3, this.p4);
    }

    private boolean checkRectangular(Point p1, Point p2, Point p3, Point p4) {
        Point auxPoint  = p1.calculateClosestPoint(new Point[]{p2,p3,p4});
        
        if( auxPoint.equals(p2)){
            return p1.getDistance(p3) == p2.getDistance(p4)
            && p1.getDistance(p4) == p2.getDistance(p3)
            && escalar(p1,auxPoint,p1.calculateClosestPoint(new Point[]{p3,p4}));
        }else if (auxPoint.equals(p3)){
            return p1.getDistance(p2) == p3.getDistance(p4)
            && p1.getDistance(p4) == p3.getDistance(p2)
            && escalar(p1,auxPoint,p1.calculateClosestPoint(new Point[]{p2,p4}));
        }else if (auxPoint.equals(p4)){
            return p1.getDistance(p2) == p4.getDistance(p3)
            && p1.getDistance(p3) == p4.getDistance(p2)
            && escalar(p1,auxPoint,p1.calculateClosestPoint(new Point[]{p2,p3}));
        }else{
            return false;
        }

    }
    
    private boolean escalar(Point p1, Point p2, Point p3){
        return (p3.getY() - p1.getY()) * (p2.getY() - p2.getY())
        + (p3.getX() - p1.getX()) * (p2.getX() - p1.getX()) == 0;
    }
    

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "p1=(" + p1.getX() + "," + p1.getY() + ")," +
                "p2=(" + p2.getX() + "," + p2.getY() + ")," +
                "p3=(" + p3.getX() + "," + p3.getY() + ")," +
                "p4=(" + p4.getX() + "," + p4.getY() + ")" +
                '}';
    }
    
}
