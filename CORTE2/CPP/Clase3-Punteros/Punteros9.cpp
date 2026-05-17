#include <iostream>
using namespace std;

class Persona 
{
public:
    string nombre; // Atributo publico.

    void saludar() // Metodo publico.
    { 
        cout << "Hola, soy " << nombre << endl;
    }
};

int main() 
{
    Persona* p = new Persona; // Reserva un objeto Persona.
    p->nombre = "Ana";        // Acceso a atributo mediante puntero.
    p->saludar();             // Llamado a metodo mediante puntero.

    delete p; // Liberar memoria del objeto.
    p = nullptr;
    
    return 0;
}