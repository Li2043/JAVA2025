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

    Rectangle testRectangle = new Rectangle(6, 7);
    testRectangle.setShapeColor(Colour.BLUE);
    System.out.println(testRectangle);


    //task 6 enum
    Triangle triangle1 = new Triangle(5, 5, 5);
    Triangle triangle2 = new Triangle(6, 6, 6);
    Triangle triangle3 = new Triangle(7, 7, 7);
    System.out.println(triangle1.getVariant());
    System.out.println(triangle2.getVariant());
    System.out.println(triangle3.getVariant());
  }
}

