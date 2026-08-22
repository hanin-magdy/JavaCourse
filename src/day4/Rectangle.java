package day4;

public class Rectangle {
    // 2 fields,properites,attributes

    private double length;
    private double width;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    //default constructor

    public Rectangle(){
        System.out.println("I am default constructor");
        length = 0;
        width = 0;
        counter++;
    }

    //parametarized,overloaded constructor

    public Rectangle(double length, double width){
        System.out.println("I am parametarized constructor");
       this.length = length;
       this.width = width;
       counter++;
        //setWidth(width);
        // setLength(length);
    }




    // Setters
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }

    // Getter
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    // 2 methods
    double calculateArea(){
      // double area = length*width;
       //return area;
       return length*width;
    }
    double calculatePerimeter(){
        double perimeter = length*2+width*2;
        return perimeter;
    }
}
