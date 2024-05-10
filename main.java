package assignment5part1;

public class main {
    public static void main (String[] args){
        //Circle
        Circle c=new Circle(8);
        System.out.println("Area of circle is "+c.calculateArea());
        System.out.println("Perimeter of circle is "+c.calculatePerimeter());

        //Triangle
        Triangle t=new Triangle(6,7,8);
        System.out.println("Area of triangle is "+ t.calculatePerimeter());
        System.out.println("Perimeter of triangle is "+t.calculatePerimeter());

        //Rectangle
        Rectangle r=new Rectangle(4,5);
        System.out.println("Area of Rectangle is "+ r.calculatePerimeter());
        System.out.println("Perimeter of Rectangle is "+r.calculatePerimeter());


    }
}
