class Rectangle
{
    public double base;
    public double height;

    public Rectangle(double b, double h)
    {
        this.base = b;
        this.height = h;
    }

    public double area()
    {
        return base * height;
    }
}

public class Rectangulo
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(3.0, 2.0);

        System.out.println("Base: " + r1.base);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.area());
    }
}