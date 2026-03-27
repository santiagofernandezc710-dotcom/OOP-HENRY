#include <iostream>
using namespace std;

class Rectangle
{
public:
    double base;
    double height;

    Rectangle(double b, double h)
    {
        base = b;
        height = h;
    }

    double area()
    {
        return base * height;
    }
};

int main()
{
    Rectangle r1(3.0, 2.0);

    cout << "Base: " << r1.base << "\n";
    cout << "Height: " << r1.height << "\n";
    cout << "Area: " << r1.area() << "\n";

    return 0;
}