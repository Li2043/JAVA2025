package edu.uob;

public abstract class TwoDimensionalShape {

  public TwoDimensionalShape() {}

  public abstract double calculateArea();
  public abstract int calculatePerimeterLength();

  private Colour shapeColor;

  public void setShapeColor (Colour shapeColor){
    this.shapeColor = shapeColor;
  }
  //Getter1
  public Colour getShapeColor(){
    return this.shapeColor;
  }
  //task 5
  @Override
  public String toString() {
    Colour a = this.getShapeColor();
    String shapeName = this.getClass().getSimpleName();
    return "This is a " + a + " " + shapeName;
  }
}
