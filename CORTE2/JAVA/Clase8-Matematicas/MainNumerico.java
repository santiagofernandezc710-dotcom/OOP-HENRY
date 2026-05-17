public class MainNumerico {
    public static void main(String[] args) {

        FuncionMatematica[] funciones = {
            new FuncionCuadratica(1.0, 0.0, 0.0),
            new FuncionSeno(),
            new FuncionExponencial(1.0, 1.0)
        };

        DerivadaCentral derivador = new DerivadaCentral(0.0001);

        IntegradorNumerico[] integradores = {
            new Trapecio(100),
            new Simpson13(100)
        };

        double x = 1.0;
        double a = 0.0;
        double b = 1.0;

        for (FuncionMatematica funcion : funciones) {

            System.out.println("====================================");
            System.out.println(funcion);
            System.out.println();

            double valor = funcion.evaluar(x);
            double derivada = derivador.derivar(funcion, x);

            System.out.println("f(" + x + ") = " + valor);
            System.out.println("Derivada aproximada en x = " + x + ": " + derivada);
            System.out.println();

            for (IntegradorNumerico integrador : integradores) {
                double area = integrador.integrar(funcion, a, b);
                System.out.println(
                    integrador.getNombre() + " en [" + a + ", " + b + "] = " + area
                );
            }

            System.out.println();
        }
    }
}