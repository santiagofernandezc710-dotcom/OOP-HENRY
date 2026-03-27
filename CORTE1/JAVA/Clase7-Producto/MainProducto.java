class Producto
{
    public String nombre;
    public double precio;

    public Producto()
    {
        nombre = "Sin nombre";
        precio = 0.0;
    }

    public Producto(String nombre)
    {
        this.nombre = nombre;
        this.precio = 0.0;
    }

    public Producto(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar()
    {
        System.out.println("Nombre = " + nombre);
        System.out.println("Precio = " + precio);
    }
}

public class MainProducto
{
    public static void main(String[] args)
    {
        Producto p1 = new Producto();
        Producto p2 = new Producto("Cuaderno");
        Producto p3 = new Producto("Lapiz", 2500.0);

        p1.mostrar();
        System.out.println();
        p2.mostrar();
        System.out.println();
        p3.mostrar();
    }
}