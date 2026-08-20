package day4;

import java.util.Scanner;

public class HomeAreaCalculaterRedo {
    private Scanner scanner = new Scanner(System.in);
    static void main() {
        HomeAreaCalculaterRedo calculator = new HomeAreaCalculaterRedo();
        Rectangle kitchen = calculator.getDimensions();
        Rectangle bathroom = calculator.getDimensions();
        calculator.scanner.close();
        double totalArea =calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("Total area is "+totalArea);

    }
    public Rectangle getDimensions(){
        System.out.println("Enter room length");
        double length = scanner.nextDouble();
        System.out.println("Enter room width");
        double width = scanner.nextDouble();
        Rectangle room = new Rectangle();
        room.setLength(length);
        room.setWidth(width);
        return room;
    }
    public double calculateTotalArea(Rectangle room1 , Rectangle room2){
//        double totalArea = room1.calculateArea()+room2.calculateArea();
//        return totalArea;
        return room1.calculateArea()+room2.calculateArea();


    }
}
