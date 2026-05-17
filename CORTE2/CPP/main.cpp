#include <iostream>
using namespace std;

class Contador {
	private:
		int contadorDelObjeto;//atributo publico
		static int contadorDeLaClase;//atributo publico
	public:
		Contador() {//metodo contador
			contadorDelObjeto=0;
		}
		
		void contar() {//metodo contar
			contadorDelObjeto++;//aumenta en 1
			contadorDeLaClase++;//aumenta en 1
			
			cout<<"Contador del objeto = "<<contadorDelObjeto<<endl;//imprime
			cout<<"Contador de la clase = "<<contadorDeLaClase<<endl;//imprime
			cout<<"---------------------"<<endl;//imprime			
		}
};

int Contador::contadorDeLaClase=0;//operador de resolucion

int main() {
	Contador a;
	Contador b;
	
	a.contar();
	a.contar();
	b.contar();
	
	return 0;
}
