package day8;

public class ShapeTester {
    static void main() {
        Shape shape = new Rectanglee(20,10);
        System.out.println(shape.calculateArea());
        shape.print();
    }
}
