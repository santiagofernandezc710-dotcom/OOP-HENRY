#include <iostream>

using namespace std;

class ParNumeros {
private:
	int x;
	int y;
	
public:
	ParNumeros(int valorX, int valorY){
		x=valorX;
		y=valorY;
	}
	
	void mostrar(const char *mensaje) {
		cout<<mensaje<<": x = "<<x<<", y = "<<y<<endl;
	}
	
	void intercambiar() {
		int temp =x;
		x=y;
		y=temp;
	}
};

int main() {
	ParNumeros par(10, 20);
	par.mostrar("Antes");
	par.intercambiar();
	par.mostrar("Despues");
	
	return 0;
}
