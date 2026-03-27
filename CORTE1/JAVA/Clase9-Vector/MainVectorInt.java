class VectorInt
{
    public int[] data;
    public int n;

    public VectorInt(int n)
    {
        this.n = n;
        this.data = new int[n];
    }

    public int suma()
    {
        int s = 0;
        for (int i = 0; i < n; i++)
            s += data[i];
        return s;
    }

    public double promedio()
    {
        if (n == 0)
            return 0.0;
        return (double) suma() / n;
    }

    public void imprimir()
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

public class MainVectorInt
{
    public static void main(String[] args)
    {
        VectorInt v = new VectorInt(5);

        v.data[0] = 10;
        v.data[1] = 20;
        v.data[2] = 30;
        v.data[3] = 40;
        v.data[4] = 50;

        v.imprimir();
        System.out.println("Suma = " + v.suma());
        System.out.println("Promedio = " + v.promedio());
    }
}