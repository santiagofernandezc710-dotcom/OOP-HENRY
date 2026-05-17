public class Investigador extends Persona {
    private String lineaTrabajo;
    private int publicaciones;

    public Investigador(String nombre, int edad, String lineaTrabajo, int publicaciones) {
        super(nombre, edad);
        setLineaTrabajo(lineaTrabajo);
        setPublicaciones(publicaciones);
    }

    public String getLineaTrabajo() {
        return lineaTrabajo;
    }

    public void setLineaTrabajo(String lineaTrabajo) {
        if (lineaTrabajo == null || lineaTrabajo.isBlank()) {
            this.lineaTrabajo = "Linea no definida";
        } else {
            this.lineaTrabajo = lineaTrabajo;
        }
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(int publicaciones) {
        if (publicaciones < 0) {
            this.publicaciones = 0;
        } else {
            this.publicaciones = publicaciones;
        }
    }

    @Override
    public String getTipo() {
        return "Investigador";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Linea de trabajo: ").append(lineaTrabajo).append("\n");
        sb.append("Publicaciones: ").append(publicaciones);
        return sb.toString();
    }
}