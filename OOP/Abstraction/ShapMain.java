// package Abstraction;

abstract class Shape{
    String color;

    abstract double area();
    public abstract String toString();

    public Shape( String color){
        System.out.println("The \"Shape\" constructor called ");
        this.color = color;          // Initiates Color Var
    }

    public String getColor(){
        return color;
    }
}
class Circle extends Shape{
    double radius;

    public Circle(String color, double radius)
    {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;  
    }

    @Override double area() {
        //throw new UnsupportedOperationException("Unimplemented method 'area'");
        return Math.PI * Math.pow(radius, 2);   // radius ^ 2
    }

    @Override
    public String toString() {
        return "Circle color is "+ super.getColor() + " and the area is "+ area();
    }
}
class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(String color, double length , double width){
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
       return length* width;
    }
   
    public String toString(){
        return "Rectangle color is " + super.getColor() + "and area is : " + area();
    }
}
    

public class ShapMain {
    public static void main(String[] args) {
        
        Shape s1 = new Circle("Yellow" ,2.5);
        Rectangle s2 = new Rectangle("Purple", 10, 8);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
