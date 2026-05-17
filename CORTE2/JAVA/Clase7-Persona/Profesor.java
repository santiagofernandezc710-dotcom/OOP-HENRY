public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        setAsignatura(asignatura);
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        if (asignatura == null || asignatura.isBlank()) {
            this.asignatura = "Asignatura no definida";
        } else {
            this.asignatura = asignatura;
        }
    }

    @Override
    public String getTipo() {
        return "Profesor";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Asignatura: ").append(asignatura);
        return sb.toString();
    }
}