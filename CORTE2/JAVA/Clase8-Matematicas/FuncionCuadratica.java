public class FuncionCuadratica extends FuncionMatematica {
    private double a;
    private double b;
    private double c;

    public FuncionCuadratica(double a, double b, double c) {
        super("Funcion cuadratica");
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double evaluar(double x) {
        return a * x * x + b * x + c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Forma: f(x) = ");
        sb.append(a).append("x^2 + ");
        sb.append(b).append("x + ");
        sb.append(c);
        return sb.toString();
    }
}