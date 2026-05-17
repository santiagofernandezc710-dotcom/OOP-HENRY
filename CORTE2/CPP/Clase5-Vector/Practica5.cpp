#include <iostream>
using namespace std;

class VectorInt
{
public:
    static const int N = 5;
    int data[N];

    void cargarEjemplo()
    {
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;
        data[4] = 50;
    }

    int suma()
    {
        int s = 0;
        for (int i = 0; i < N; i++)
            s += data[i];
        return s;
    }

    double promedio()
    {
        return (double)suma() / N;
    }

    void imprimir()
    {
        for (int i = 0; i < N; i++)
        {
            cout << data[i] << " ";
        }
        cout << "\n";
    }
};

int main()
{
    VectorInt v;
    v.cargarEjemplo();

    v.imprimir();
    cout << "Suma = " << v.suma() << "\n";
    cout << "Promedio = " << v.promedio() << "\n";
    return 0;
}