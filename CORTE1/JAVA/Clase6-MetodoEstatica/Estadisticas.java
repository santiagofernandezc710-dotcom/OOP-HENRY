public class Estadisticas 
{
    // Clase estática llamada Stats donde se hacen los cálculos
    static class Stats 
    {
        // Método estático que calcula la suma de los elementos del arreglo
        public static int sum(int[] a) 
        {
            int total = 0; // Variable donde se acumulará la suma

            // Bucle for mejorado que recorre cada elemento del arreglo
            for (int x : a) total += x; // x toma el valor de cada elemento del arreglo

            return total; // Devuelve la suma total de los elementos
        }

        // Método estático que calcula el promedio del arreglo
        public static double average(int[] a) 
        {
            // Llama al método sum para obtener la suma y la divide entre la cantidad de elementos
            return (double) sum(a) / a.length; // Se convierte a double para obtener decimales
        }
    }

    // Método principal donde comienza la ejecución del programa
    public static void main(String[] args) 
    {
        // Declaración de un arreglo de enteros llamado grades que ya tiene sus datos puestos
        int[] grades = {80, 75, 90, 60, 95};

        // Imprime en pantalla la suma de los elementos del arreglo
        System.out.println("Sum: " + Stats.sum(grades));

        // Imprime en pantalla el promedio de los elementos del arreglo
        System.out.println("Average: " + Stats.average(grades));
    }
}
