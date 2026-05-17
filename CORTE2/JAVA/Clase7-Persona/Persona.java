public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public String getTipo() {
        return "Persona";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo: ").append(getTipo()).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: ").append(edad);
        return sb.toString();
    }
}