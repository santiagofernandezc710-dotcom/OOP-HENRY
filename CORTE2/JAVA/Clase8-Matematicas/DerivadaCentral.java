public class DerivadaCentral {
    private double h;

    public DerivadaCentral(double h) {
        setH(h);
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h <= 0) {
            this.h = 0.0001;
        } else {
            this.h = h;
        }
    }

    public double derivar(FuncionMatematica f, double x) {
        double adelante = f.evaluar(x + h);
        double atras = f.evaluar(x - h);
        return (adelante - atras) / (2.0 * h);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Metodo: derivada por diferencia central\n");
        sb.append("h = ").append(h);
        return sb.toString();
    }
}