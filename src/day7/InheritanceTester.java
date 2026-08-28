package day7;

import day4.Rectangle;

public class InheritanceTester {
    static void main() {
        Person person = new Person();
        Employee employee = new Employee();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);

        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(10);

        System.out.println(square.calculatePerimeter());
        Women women = new Women();
        Mother mother = new Mother();
        System.out.println(mother.getName());

    }
}
