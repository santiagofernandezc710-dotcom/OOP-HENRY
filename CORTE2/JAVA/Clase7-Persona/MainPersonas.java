public class MainPersonas {
    public static void main(String[] args) {

        Persona p1 = new Persona("Ana", 34);
        Profesor p2 = new Profesor("Carlos", 45, "Programacion en Java");
        Investigador p3 = new Investigador("Diana", 39, "Robotica movil", 12);

        p1.setEdad(35);
        p2.setAsignatura("Programacion orientada a objetos");
        p3.setPublicaciones(15);

        System.out.println("Consulta usando getters");
        System.out.println("Nombre de p1: " + p1.getNombre());
        System.out.println("Edad de p1: " + p1.getEdad());
        System.out.println();

        System.out.println("Impresion directa de objetos");
        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);
        System.out.println();

        Persona[] personas = {p1, p2, p3};

        System.out.println("Recorrido polimorfico");
        for (Persona persona : personas) {
            System.out.println("--------------------------");
            System.out.println(persona);
        }
    }
}