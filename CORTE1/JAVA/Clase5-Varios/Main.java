class Person
{
    public String name;
    public int age;

    public Person()
    {
        name = "";
        age = 0;
    }

    public void sayHello()
    {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.name = "Luna";
        p1.age = 18;

        p1.sayHello();
    }
}