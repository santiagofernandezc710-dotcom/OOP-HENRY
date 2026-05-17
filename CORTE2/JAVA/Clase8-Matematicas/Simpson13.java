public class Simpson13 extends IntegradorNumerico {

    public Simpson13(int subintervalos) {
        super("Regla de Simpson 1/3", ajustarSubintervalos(subintervalos));
    }

    private static int ajustarSubintervalos(int subintervalos) {
        if (subintervalos <= 0) {
            return 10;
        }
        if (subintervalos % 2 != 0) {
            return subintervalos + 1;
        }
        return subintervalos;
    }

    @Override
    public double integrar(FuncionMatematica f, double a, double b) {
        int n = getSubintervalos();
        double h = (b - a) / n;
        double suma = f.evaluar(a) + f.evaluar(b);

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 2 == 0) {
                suma += 2.0 * f.evaluar(x);
            } else {
                suma += 4.0 * f.evaluar(x);
            }
        }

        return (h / 3.0) * suma;
    }
}