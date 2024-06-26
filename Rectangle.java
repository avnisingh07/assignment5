package assignment5part1;

public class Rectangle implements Shape {
    private double length;
    private double breadth;
    public Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }


    @Override
    public double calculatePerimeter() {
        return (2*(length+breadth));
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}
