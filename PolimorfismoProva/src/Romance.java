public class Romance extends Livro{

    public Romance(int cod, int diasAtraso, String nome, double valor) {
        super(cod, diasAtraso, nome, valor);
    }

    @Override
    public void CalcularMulta() {
        double vlrMulta = (getValor() * (5/100.00)) + (1.0 * getDiasAtraso());

        System.out.printf("A multa será de R$ %.2f", vlrMulta);

    }
}
