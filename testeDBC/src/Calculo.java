public class Calculo {
    public double calcular(int n, int x, double valor) {
        if (n == 0) {
            return (valor + valor * x / 100.0);
        } else {
            return (valor * x);
        }

    }

    public static void main(String[] args) {

        Calculo q1 = new Calculo();

        Calculo q2 = new Calculo();

        System.out.print(q1.calcular(2, 5, 100));

        System.out.print(q2.calcular( 0, 5, 100));

    }

}
