package arrays1;

import java.util.Scanner; //Importo la clase Scanner para que el usuario pueda ingresar datos

//Pongo la clase publica Arrays1
public class Arrays1 
{
    //Creo el objeto Scanner de manera global en la clase Arrays1
    public static Scanner sc = new Scanner(System.in);
    //creo los Objetos enteros (un arreglo entero n) y un entero n
    public int[] data;
    public int n;

    //El arreglo esta tomando el tamaño n que le da el usuario
    public Arrays1(int n) 
    {
        // Estos son atributos
        this.n = n; //Significa que el atributo de la clase this.n tomara los valores del parametro n que llega al metodo constructor
        this.data = new int[n];   //Crea el arreglo llamado data que tomara el tamaño n que le asignara el usuario 
    }

    //Creo un metodo llamado get vector que me imprime el vector
    public void getvector(String name) //Pongo publico el getvector. El String name es para que imprima el nombre del vector
    {
        System.out.print(name + " = [ "); //Imprimo "name que no se que es" + un igual con el inicio del vector en [
        for (int i = 0; i < n ; i++)  //Para entero i=0 hasta i< que el numero que escribio el usuario, si el usuario puso 7 el arreglo sera de 7, incrementa i en 1 
        {
            System.out.print(data[i]);//Imprime el dato que esta guardado en cada casilla en el arreglo llamado data
            if (i < n - 1) /*Condicional si i es menor que el tamaño del vector menos 1 imprime lo siguiente, Ejemplo: 
                             si el vector es de 8 casillas y i va en 0, coloca el numero guardado en v[0] y como i=0 es menor que 
                             n=8-1=7 entonces coloca una "," posteriormente */
            {
                System.out.print(" , "); // Imprime coma
            }
        }
        System.out.println(" ]"); //Cuando termina el ciclo for, osea de imprimir todo el vector imprime ] para cerrarlo
    }
    
    //Creo el metodo setvector que lo que hace es coger los datos que el usuario digita y guardarlos 
    public void setvector(String name) //pongo en publico
    {
        for (int i = 0; i < n ; i++) //Creo el ciclo for, desde i=0, i< que el tamaño del vector, i incrementa en 1
        {
            System.out.print("v[" + i + "]: "); //Imprime "v[" para indicar cual es la columna + i que va de 0 a 7 + "]" para cerrar el arreglo
            data[i] = sc.nextInt(); //Se guarda la informacion casilla por casilla que digita el usuario en el arreglo llamado data
        }
    }
    
    //Finalmente tengo el main principal,String[] args es un arreglo de Strings que permite recibir argumentos desde la consola al ejecutar el programa
    public static void main(String[] args)  //lo pongo publico
    {
        System.out.print("Tamano n: ");//Imprime antes que todo "Tamaño del vector" para que el usuario sepa que debe ingresar
        int n = sc.nextInt(); // El entero n el cual es el tamaño del vector sera igual a lo que dijite el usuario

        Arrays1 v = new Arrays1(n); //Creo un objeto llamado v de la clase Arrays1 usando el constructor que toma el tamaño del vector
        v.setvector("V"); //Llamo al metodo setvector para que le pida y guarde los datos del usuario
        v.getvector("V"); //Llamo el metogo getvector para que me imprima el vector con los datos del usuario

        sc.close(); //Cierro el Objeto tipo Scanner llamado sc para evitar warnings
    }
}
