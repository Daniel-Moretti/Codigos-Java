public class Motocicleta extends Veiculo{

    public Motocicleta(int ano, String modelo, String cor) {
        super(ano, modelo, cor);
    }

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void CalcularIpva(){
        int tempoUso = 2023 - getAno();
        double vlrIpva = 0;
        if (tempoUso > 10){
            vlrIpva = getValor() * (5/100.00);

        } else if (tempoUso <= 10) {
            vlrIpva = getValor() * (10/100.00);
        }

        System.out.printf("\nO valor de IPVA da Motocicleta é %.2f", vlrIpva);

    }

    public void Seguro(){
        double vlrSeguro = 0;
        if (getAno() > 2009){
            vlrSeguro = getValor() * (10/100.00);

        } else if (getAno() < 2009) {
            vlrSeguro = getValor() * (5/100.00);
        }

        System.out.printf("\nO valor do Seguro da Motocicleta é %.2f", vlrSeguro);
    }


}
