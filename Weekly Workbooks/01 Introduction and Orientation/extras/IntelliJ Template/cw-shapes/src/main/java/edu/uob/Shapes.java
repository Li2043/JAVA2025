package edu.uob;

public class Shapes {

  // TODO use this class as then entry point; play around with your shapes, etc
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Triangle testTriangle = new Triangle(5, 7, 9);
    Colour currentColour = testTriangle.getShapeColor();
    int longestSide = testTriangle.getLongestSide();
    System.out.println("The longest side of the triangle is " + longestSide);

    //task 3

    Circle testCircle = new Circle(5);
    testCircle.setShapeColor(Colour.RED);
    System.out.println(testCircle);//自动调用 Circle.toString()

    testTriangle.setShapeColor(Colour.GREEN);
    System.out.println(testTriangle);

    Rectangle testRectangle = new Rectangle(6,7);
    testRectangle.setShapeColor(Colour.BLUE);
    System.out.println(testRectangle);
  }
}
