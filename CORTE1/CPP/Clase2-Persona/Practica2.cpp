#include <iostream>
#include <string>
using namespace std;

//primera clase: entender "clase" vs "objeto"
class persona
{
public:
        string nombre; //atributo
        int edad; //atributo

        //metodo (funcion dentro de una clase
        void saludar()
        {
                cout<<"hola, soy "<<nombre<<" y tengo "<<edad<<" años.\n";
        }
};



int main()
{
	//crear un objeto (una "persona" real)
	persona p1;
	persona p2;
	persona p3;

	//asignar valores a los atributos
	p1.nombre= "Santiago Fernandez Calvo";
	p1.edad= 17;

	p2.nombre="Cristiano Ronaldo Dos Santos Aveiro";
	p2.edad= 42;

	p3.nombre="Lionel Andres Messi";
	p3.edad= 38;
	//llamar un metodo del objeto
	p1.saludar();
	p2.saludar();
	p3.saludar();
	return 0;
}