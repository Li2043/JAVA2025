package edu.uob;
//引入 @Test 注解
import org.junit.jupiter.api.Test;
//静态导入 所有断言方法（Assertions）
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriAreaPerimeter {

    @Test
    public void testPerimeter() {
        Triangle t1 = new Triangle(5, 5, 3);
        assertEquals(13, t1.calculatePerimeterLength());
        Triangle t2 = new Triangle(4, 5, 3);
        assertEquals(12, t2.calculatePerimeterLength());
        Triangle t3 = new Triangle(3, 5, 3);
        assertEquals(11, t3.calculatePerimeterLength());
    }

    @Test
    public void testArea() {
        Triangle t1 = new Triangle(5, 5, 3);
        assertEquals(7.15, t1.calculateArea(),0.1);
        Triangle t2 = new Triangle(4, 5, 3);
        assertEquals(6, t2.calculateArea(),0.1);
        Triangle t3 = new Triangle(3, 5, 3);
        assertEquals(4.15, t3.calculateArea(),0.1);
    }

}
