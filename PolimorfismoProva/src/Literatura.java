public class Literatura extends Livro{

    public Literatura(int cod, int diasAtraso, String nome, double valor) {
        super(cod, diasAtraso, nome, valor);
    }

    @Override
    public void CalcularMulta() {
        double vlrMulta = (getValor() * (10/100.00)) + (0.5 * getDiasAtraso());

        System.out.printf("A multa será de R$ %.2f", vlrMulta);
    }
}
