public class FuncionExponencial extends FuncionMatematica {
    private double amplitud;
    private double k;

    public FuncionExponencial(double amplitud, double k) {
        super("Funcion exponencial");
        setAmplitud(amplitud);
        setK(k);
    }

    public double getAmplitud() {
        return amplitud;
    }

    public void setAmplitud(double amplitud) {
        this.amplitud = amplitud;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    @Override
    public double evaluar(double x) {
        return amplitud * Math.exp(k * x);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Forma: f(x) = ");
        sb.append(amplitud).append("e^(");
        sb.append(k).append("x)");
        return sb.toString();
    }
}