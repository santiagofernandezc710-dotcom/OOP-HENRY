public class FuncionSeno extends FuncionMatematica {

    public FuncionSeno() {
        super("Funcion seno");
    }

    @Override
    public double evaluar(double x) {
        return Math.sin(x);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Forma: f(x) = sin(x)");
        return sb.toString();
    }
}