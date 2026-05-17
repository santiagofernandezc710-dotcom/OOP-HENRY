public abstract class FuncionMatematica {
    private String nombre;

    public FuncionMatematica(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            this.nombre = "Funcion sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public abstract double evaluar(double x);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcion: ").append(nombre);
        return sb.toString();
    }
}