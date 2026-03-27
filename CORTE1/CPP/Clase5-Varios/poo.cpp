#include <iostream>
using namespace std;

class Person
{
public:
    string name;
    int age;

    Person()
    {
        name = "";
        age = 0;
    }

    void say_hello()
    {
        cout << "Hi, I'm " << name << " and I'm " << age << " years old.\n";
    }
};

int main()
{
    Person p1;
    p1.name = "Adrian";
    p1.age = 20;

    p1.say_hello();
    return 0;
}