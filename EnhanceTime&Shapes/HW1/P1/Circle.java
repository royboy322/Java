//Michael Roy

public class Circle extends Shape
{
    // instance variables
    private double m_radius;

    // constructor
    public Circle(String color, double radius) {
        super(color);
        m_radius = radius;
    } 

    // calculate the area of the circle (you need to override the superclass method)
    @Override
    public double calcArea() 
    {
        return 3.14*m_radius*m_radius;
    }

    // calculate the perimeter of the circle (you need to override the superclass method)
    @Override
    public double calcPerimeter() 
    {
        return 2*3.14*m_radius;
    }
}
