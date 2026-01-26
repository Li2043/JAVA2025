package edu.uob;

public class Shapes {

  // TODO use this class as then entry point; play around with your shapes, etc
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Triangle testTriangle = new Triangle(5, 7, 9);
    int longestSide = testTriangle.getLongestSide();
    System.out.println("The longest side of the triangle is " + longestSide);

    //task 3
    TwoDimensionalShape shape;
    shape = new Circle(5);
    System.out.println(shape);//自动调用 Circle.toString()

    shape = new Triangle(5, 6, 7);
    System.out.println(shape);

    shape = new Rectangle(6,7);
    System.out.println(shape);
  }
}
