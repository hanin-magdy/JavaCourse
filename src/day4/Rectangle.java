package day4;

public class Rectangle {
    // 2 fields,properites,attributes
    private double length;
    private double width;
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
