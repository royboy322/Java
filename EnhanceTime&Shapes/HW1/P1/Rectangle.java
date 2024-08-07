//Michael Roy

public class Rectangle extends Shape
{
    // instance variables
    private double m_width; 
    private double m_length; 

    // constructor
    public Rectangle(String color, double width, double length) {
        super(color);
        m_width = width;
        m_length = length; 
    }

    // calculate the area of the rectangle (you need to override the superclass method)
    @Override
    public double calcArea() 
    {
        return m_width*m_length;
    }

    // calculate the perimeter of the rectangle (you need to override the superclass method)
    @Override
    public double calcPerimeter() 
    {
        return 2*(m_width+m_length);
    }
}
