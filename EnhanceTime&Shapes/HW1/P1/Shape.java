//Michael Roy

public class Shape
{
    // instance variables
    private String m_color;
    
    // constructor
    public Shape(String color)
    {
        m_color = color;
    }
    
    // calculate the area of the shape
    public double calcArea()
    {
        return 0.0;
    }
    
    // calculate the perimeter of the shape
    public double calcPerimeter()
    {
        return 0.0;
    }
    
    @Override
    // return a string presentation of the shape
    public String toString()
    {
        String strShape = "";
        
        strShape += "  Color: " + m_color + "\n";
        strShape += "  Area: " + calcArea() + "\n";
        strShape += "  Perimeter: " + calcPerimeter() + "\n";
        
        return strShape;
    }
}
