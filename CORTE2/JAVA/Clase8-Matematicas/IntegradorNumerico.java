public abstract class IntegradorNumerico {
    private String nombre;
    private int subintervalos;

    public IntegradorNumerico(String nombre, int subintervalos) {
        setNombre(nombre);
        setSubintervalos(subintervalos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            this.nombre = "Integrador sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public int getSubintervalos() {
        return subintervalos;
    }

    public void setSubintervalos(int subintervalos) {
        if (subintervalos <= 0) {
            this.subintervalos = 10;
        } else {
            this.subintervalos = subintervalos;
        }
    }

    public abstract double integrar(FuncionMatematica f, double a, double b);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Metodo: ").append(nombre).append("\n");
        sb.append("Subintervalos: ").append(subintervalos);
        return sb.toString();
    }
}