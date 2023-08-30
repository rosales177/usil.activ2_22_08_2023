package clases;

public class Point {
  private double x;
    private double y;
    
    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    public Double getDistance(){
        return getDistance(this);
    }
    
    public Double getDistance(Point otherPoint){
      try{
        Double d = Math.pow(((double)otherPoint.getX() - (double)this.getX()),2) + Math.pow(((double)otherPoint.getY() - (double)this.getY()),2);
        d = Math.sqrt(d); 
        return d;
      }catch (Exception er){
          return (double) 0;
      }
    }

    public String toString(){
        return "(" + this.getX() + "," + this.getY() + ")";
    }

    public Point calculateClosestPoint(Point[] othersPoints){
        Point _point = null;

        double minDistance = Double.MAX_VALUE;
        double currentDistance;

        for(int i = 0; i < othersPoints.length; i ++)
        {
            currentDistance = this.getDistance(othersPoints[i]);
            if(currentDistance < minDistance){
                minDistance = currentDistance;
                _point = othersPoints[i];
            }
        }

        return _point;
    }

    

}
