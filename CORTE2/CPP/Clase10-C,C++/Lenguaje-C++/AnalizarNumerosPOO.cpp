#include <iostream>
using namespace std;

class AnalizadorNumeros {
private:
    int a, b, c;
    int suma;
    int mayor;
    int menor;

public:
    AnalizadorNumeros(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void analizar() {
        suma = a + b + c;

        mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }
    }

    int getSuma() {
        return suma;
    }

    int getMayor() {
        return mayor;
    }

    int getMenor() {
        return menor;
    }
};

int main() {
    AnalizadorNumeros obj(8, 3, 15);

    obj.analizar();

    cout << "Suma = " << obj.getSuma() << endl;
    cout << "Mayor = " << obj.getMayor() << endl;
    cout << "Menor = " << obj.getMenor() << endl;

    return 0;
}
