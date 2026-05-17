#include <iostream>

using namespace std;

class Numero {
private:
	int valor;
	
public:
	Numero(int valorInicial) {
		valor = valorInicial;
	}
	
	void mostrar() {
		cout<<"valor = "<<valor<<endl;
	}
	
	void cambiarValor(int nuevoValor) {
		valor = nuevoValor;
	}
};

int main() {
	Numero objeto(25);
	Numero *pObjeto = &objeto;
	cout<<"&objeto = "<<static_cast<const void *>(&objeto)<<endl;
	cout<<"pObjeto = "<<static_cast<const void *>(pObjeto)<<endl;
	pObjeto->mostrar();
	pObjeto->cambiarValor(99);
	objeto.mostrar();
	
	return 0;
}
