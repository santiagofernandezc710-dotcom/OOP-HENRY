public class Trapecio extends IntegradorNumerico {

    public Trapecio(int subintervalos) {
        super("Regla del trapecio", subintervalos);
    }

    @Override
    public double integrar(FuncionMatematica f, double a, double b) {
        int n = getSubintervalos();
        double h = (b - a) / n;
        double suma = f.evaluar(a) + f.evaluar(b);

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            suma += 2.0 * f.evaluar(x);
        }

        return (h / 2.0) * suma;
    }
}