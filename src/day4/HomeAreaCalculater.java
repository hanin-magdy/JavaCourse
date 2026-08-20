package day4;

public class HomeAreaCalculater {
    static void main() {
        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        room1.setWidth(10);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("The area of the room 1 is "+areaOfRoom1);
        double perimeter = room1.calculatePerimeter();
        System.out.println("The perimeter of the room 1 is "+perimeter);

        Rectangle room2 = new Rectangle();
        room2.setWidth(5);
        room2.setLength(10);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("The area of the room 2 is "+areaOfRoom2);
        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Total area of the two rooms "+totalArea);

    }
}
