#include <iostream> //libreria para usar cout,cin etc
#include <string> //libreria para poder usar string
using namespace std; //para no tener que poner :: al usar cout,cin

const int personas=5; //le da el limite para incribir 5 estudiantes
const int notaspersonas=3; //a cada estudiante solo le inscribe 3 notas

//---CLASE ESTUDIANTE---
class Estudiante //clase estudiante 
{
public: //se pone publico todo lo que va despues
    string codigo; //su atributo codigo 
    string nombre; //su atributo nombre
    int edad; //su atributo edad
    
	//sobrecarga de constructores
    Estudiante() // metodo constructor sin parametros(creo un cascaron vacio)
	{
        codigo = "";
        nombre = "";
        edad = 0;
    }

    Estudiante(string c, string n, int e) //metodo constructor con parametros(aqui ya le asigno valores)
	{
        codigo = c;
        nombre = n;
        edad = e;
    }
};

//---CLASE VISTA---
class Vista
{
public:
	//colores para que se vea mejor
    const string NARANJA  = "\u001B[38;5;208m";
	const string AMARILLO = "\u001B[33m";
    const string AZUL     = "\u001B[34m";
    const string ROJO     = "\u001B[31m";
    const string MORADO   = "\u001B[35m";
    const string RESET    = "\u001B[0m";
    
	void Bienvenida()
	{
		cout<<NARANJA<<"****Bienvenido****"<<RESET<<endl;
	}
	//Metodo Menu para visualizar las opciones del usuario
	void Menu()
	{
		cout<<NARANJA<<"---Menu---"<<RESET<<endl;
		cout<<AMARILLO<<"1.Registrar Estudiante"<<endl;
		cout<<"2.Buscar Estudiante"<<endl;
		cout<<"3.Mostrar todos los Estudiantes"<<endl;
		cout<<"4.Asignar Notas"<<endl;
		cout<<"5.Promediar Notas"<<endl;
		cout<<"6.Salir"<<RESET<<endl;
	}
	
	//Metodo Salir para que se acabe el programa
	void Salir()
	{
		cout<<AMARILLO<<"Saliendo de la aplicacion..."<<RESET<<endl;
	}	
	
	//Metodo Error por si el usuario digita algo que no se puede
	void Error()
	{
		cout<<ROJO<<"Esto no se puede, intenta otra vez."<<RESET<<endl;
	}	
	
	//--PARA EL CASO 1--
		//Metodo tituloregistrarestudiante
		void Registrarestudiante()
		{
			cout<<MORADO<<"---Registrar Estudiante---"<<RESET<<endl;
		}
		//Metodo pidecodigo
		void Pidecodigo()
		{
			cout<<AZUL<<"Ingrese el codigo: "<<RESET;
		}
		//Metodo pidenombre
		void Pidenombre()
		{
			cout<<AZUL<<"Ingrese el nombre: "<<RESET;
		}
		//Metodo pideedad
		void Pideedad()
		{
			cout <<AZUL<<"Ingrese Edad: "<<RESET;
		}
    //--PARA EL CASE 2--
    	//Metodo titulobuscaestudiante
		void Buscaestudiante()
		{
			cout<<MORADO<<"---Buscar Estudiante---"<<RESET<<endl;
		}
		//Metodo pidecodigo
		void Pidecodigoestudiante()
		{
			cout<<AZUL<<"Ingrese el codigo del estudiante: "<<RESET;
		}
		//Metodo estudianteencotnrado
		void Estudianteencontrado()
		{
			cout<<AZUL<<"El estudiante ah sido encontrado"<<RESET<<endl;
		}
		//Metodo muestranombre
		void Muestranombre()
		{
			cout <<AZUL<<"Nombre: "<<RESET;
		}
        //Metodo muestracodigo
		void Muestraedad()
		{
			cout <<AZUL<<"Edad: "<<RESET;
		}
        //Metodo errorcodigo por si el usuario digita algo que no se puede
        void Errorcodigo()
        {
            cout<<ROJO<<"Este codigo no existe, intenta otra vez."<<RESET<<endl;
        }
	//--PARA EL CASE 3--
		//Metodo titulobuscaestudiante
		void muestraestudiante()
		{
			cout<<MORADO<<"---Mostrando Estudiantes---"<<RESET<<endl;
		}
    	//metodo error si el estudiante no esta registrado
		void Errormuestra()
		{
			cout<<ROJO<<"No hay Estudiantes registrados"<<RESET<<endl;
		}
		//se usa el muestra nombre y muestra edad del case 2
		void Muestracodigo()
		{
			cout<<AZUL<<"Codigo: "<<RESET;
		}
	//--PARA EL CASE 4--
		//uso el error muestra del case 3
		//metodo ingresenota
		void Ingresenota()
		{
			cout<<AZUL<<"Ingrese nota: "<<RESET<<endl;
		}
		//metodo nota registrada
		void Notaregis()
		{
			cout<<AZUL<<"Nota registrada con exito!"<<RESET<<endl;
		}
	//--PARA EL CASE 5--
		//metodo nopromedio
		void Nopromedio()
		{
			cout<<AZUL<<"No se puede promediar porque el alumno no tiene notas"<<RESET<<endl;
		}
};

//---CLASE DATO---
class Dato
{
public:
	Estudiante estudiantes[personas];//crea un arreglo que como maximo puede tener 5 personas
    int notas[personas][notaspersonas];//por cada persona se le pueden asignar hasta 3 notas
    int contador; //una variable contador

    Dato() //metodo constructor
	{
        contador=0; //contador inicia desde 0
        for (int i=0; i<personas; i++) //para i=0 hasta i<5 i se incrementa
            for (int j=0; j<notaspersonas; j++) //para j=0 hasta j<3 j se incrementa
                notas[i][j]=0;// retorna la variable notas con los parametros guardados
    }
};

//---CLASE REGISTRA---
class Registra
{
public:
	void registrar(Dato &d,string codigo,string nombre,int edad) //el metodo registrar tiene los parametros de los datos de la persona y el Datos &d sirve para que se cojan los datos de la clase Datos
	{
        if (d.contador<personas) //si el contador es menor que 5 personas entonces
		{
            d.estudiantes[d.contador]=Estudiante(codigo,nombre,edad);//se crea y se guardan los datos del estudiante y se registran
            d.contador++; //el contador sube en 1
        }
    }	
};

//---CLASE BUSCA---
class Busca
{
public:
    int buscar(Dato &d, string codigo) //metodo buscar que retorna un entero
    {
        for (int i = 0; i <d.contador; i++) //para i=0 hasta i<los datos de contador(si hay 1 persona sera <1) i incrementa
        {
            if (d.estudiantes[i].codigo==codigo)//si el estudiante guardado tiene el codigo similar al que buscas entonces
                return i;//retorna i osea la dirrecion en donde se guarda la info del estudiante
        }
        return -1; //si no retornara -1 que significa que no encontro nada
    }
};

//----CLASE NOTA---
class Nota
{
public:
	Vista vista;
	void notas(Dato &d,int posicion)
	{
		if(posicion!=-1)
		{
			for(int i=0;i<notaspersonas;i++)
			{
				vista.Ingresenota();
				cin>>d.notas[posicion][i];
			}
			vista.Notaregis();
		}
		else if(posicion==-1)
		{
			vista.Errormuestra();
		}
	}
};

//---CLASE MUESTRA---
class Muestra
{
public:
	Vista vista;
	void muestra(Dato &d)
	{
		if(d.contador==0) //si el contador es 0 osea si no hay estudiantes
		{
			vista.Errormuestra(); //muestra este mensaje
		}
		else if(d.contador>0) //sino si el contador es mayor que 0
		{
			for(int i=0;i<d.contador;i++) //muestra todos los estudiantes
			{
				vista.Muestranombre();
				cout<<d.estudiantes[i].nombre<<endl;
				vista.Muestraedad();
				cout<<d.estudiantes[i].edad<<endl;
				vista.Muestracodigo();
				cout<<d.estudiantes[i].codigo<<endl;
				//Para que muestre las notas de la clase notas
				for(int j=0;j<notaspersonas;j++) 
				{
					cout<<"["<<d.notas[i][j]<<"]";
				}
				cout<<endl;
			}
		}
	}
};

//---CLASE PROMEDIO---
class Promedio
{
public:
	Vista vista;
	void Promedionotas(Dato &d,int posicion)
	{
		if (posicion != -1) 
		{
            float suma=0;
            for (int j=0;j<notaspersonas;j++) 
			{
                suma+=d.notas[posicion][j];
            }
            float resultado=suma/notaspersonas;
			cout<<resultado<<endl;
		}
		else
		{
			vista.Nopromedio();
		}
	}
};

//---MAIN PRINCIPAL---
int main()
{
	Vista vista;//Creo el objeto vista
	Registra registra;//creo el objeto registrar
	Dato dato;//creo el objeto registrar
    Busca busca;
	Muestra muestra;
	Nota nota;
	Promedio promedio;
	
	int opcion; //creo opcion para hacer el do while con switch
	string c;//variable codigo
	string n;//variable nombre
    int e;//variable edad
	
	do
	{
		vista.Menu(); //llamo al metodo menu de la clase vista
		cin>>opcion; //guarda el valor que le da el usuario
		switch(opcion) //para los diferentes casos
		{
			//----PARA REGISTRAR A LOS ESTUDIANTES---
			case 1: 
			{
				vista.Registrarestudiante();//el titulo para registrar un estudiante
                vista.Pidecodigo();//pide el codigo
                cin>>c;//Copia el codigo
                vista.Pidenombre();//pide el nombre
                cin.ignore(); // limpia el buffer para que getline no se salte
                getline(cin, n); // me deja poner espacio en los nombres
				do//para que no puedan haber edades negativas o muy largas
				{
					vista.Pideedad();
					cin>>e;

					if(e<=0 || e>100)
					{
						vista.Error();
					}

				} while(e<=0 || e>100);
				registra.registrar(dato,c,n,e);//aqui llamo a la clase registrar
				break;
			}
			//----PARA BUSCAR A LOS ESTUDIANTES----
			case 2:
            {
                string busqueda;//creo una variable busqueda
                vista.Buscaestudiante();//el titulo para buscar un estudiante 
				vista.Muestracodigo();
                cin >> busqueda; //resive lo que escribio el usuario
                int posicion=busca.buscar(dato,busqueda);// creo una variable entera llamada posicion
                if (posicion != -1) // si la posicion es diferente de uno, se encontro al estudiante
                {
                    vista.Estudianteencontrado();
                    vista.Muestranombre();
                    cout<<dato.estudiantes[posicion].nombre<<endl;
                    vista.Muestraedad();
                    cout<<dato.estudiantes[posicion].edad<<endl;
					vista.Muestracodigo();
					cout<<dato.estudiantes[posicion].edad<<endl;
                }
                else 
                {
                    vista.Errorcodigo();
                }
				break;
            }
			//----PARA MOSTRAR A LOS ESTUDIANTES----
			case 3:
			{
				vista.muestraestudiante();
				muestra.muestra(dato);
				break;
			}

			//----PARA ASIGNAR NOTAS A LOS ESTUDIANTES----
			case 4:
			{
				string busqueda;
				vista.Pidecodigoestudiante(); 
				cin >> busqueda;
				int p = busca.buscar(dato, busqueda);
				nota.notas(dato, p); 
				break;
			}

			//----PARA PROMEDIAR LAS NOTAS DE LOS ESTUDIANTES----
			case 5:
			{
				string busqueda;
				vista.Pidecodigoestudiante(); 
				cin >> busqueda;
				int p = busca.buscar(dato, busqueda);
				promedio.Promedionotas(dato, p); 
				break;
			}

            case 6: //por si quiere salir del programa
				vista.Salir();
				break;
			default: // por si pone una opcion no valida
				vista.Error();	
				break;
		}
	}while (opcion != 6);//se repetira hasta que el usuario decida salir del programa
	return 0;
}