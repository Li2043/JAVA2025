package edu.uob;

public class Triangle extends TwoDimensionalShape{
  int length1;
  int length2;
  int length3;
  // TODO implement me!
  // constructor method
  public Triangle(int length1, int length2, int length3) {
    //把参数的值，存进对象自己的成员变量里
    this.length1 = length1;
    this.length2 = length2;
    this.length3 = length3;
  }
  public enum triangleType {
    X1, X2,.;
  }

  public int getLongestSide(){
    int max;
    if (length1 > length2){
      max = length1;
    }
    else{
      max = length2;
    }

    if (max > length3){
      return max;
    }
    else{
      return length3;
    }
  }

  // TODO implement me!
  public double calculateArea() {
    return 0;
  }

  // TODO implement me!
  public int calculatePerimeterLength() {
    return 0;
  }

  //public String toString() {
    //Colour a = this.getShapeColor();
    //return "This is a " + a + "Triangle with length1: " + length1 +  length2 + length3;
  //}
  public String toString() {
    return super.toString();
  }
}
