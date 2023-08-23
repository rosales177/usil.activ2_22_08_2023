package clases;

public abstract class GeometricFigure {
  protected String name;
    
    
  public GeometricFigure(){}
  
  public GeometricFigure(String name){
      this.name = name;
  }
  
  public String getName(){
      return this.name;
  }
  
  public void setName(String name){
      this.name = name;
  }
  
  public abstract double CalculateArea();
  
  public abstract boolean isRegular();
}
