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
  //week3 task2
  // TODO implement me! 算面积
  @Override
  public double calculateArea() {
    double p = (double) (length1 + length3 + length2) / 2;
    return Math.sqrt(p * (p - length1) * (p - length2) * (p - length3));
  }
  @Override
  // TODO implement me! 算周长
  public int calculatePerimeterLength() {
    return length1 + length3 + length2;
  }

  public String toString() {
    return super.toString();
  }

  public TriangleVariant getVariant() {
    long a = length1;
    long b = length2;
    long c = length3;
    if (length1 <= 0 || length2 <= 0 || length3 <= 0) {
      return TriangleVariant.ILLEGAL;
    } else if (length1 < length3 - length2
            || length1 < length2 - length3
            || length2 < length1 - length3) {
      return TriangleVariant.IMPOSSIBLE;
    } else if (length1 == length3 - length2
            || length1 == length2 - length3
            || length2 == length1 - length3) {
      return TriangleVariant.FLAT;
    } else if (length1 == length2 && length1 == length3) {
      return TriangleVariant.EQUILATERAL;
    } else if (length1 == length2 || length1 == length3 || length2 == length3) {
      return TriangleVariant.ISOSCELES;
    } else if (a * a + b * b == c * c
            || a * a + c * c == b * b
            || b * b + c * c == a * a) {
      return TriangleVariant.RIGHT;
    } else {
      return TriangleVariant.SCALENE;
    }
  }
}



