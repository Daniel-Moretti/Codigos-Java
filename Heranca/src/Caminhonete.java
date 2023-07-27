public class Caminhonete extends Veiculo{

    public Caminhonete(int ano, String modelo, String cor) {
        super(ano, modelo, cor);
    }

    private double tamanho;
    private double valor;

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

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

        System.out.printf("\nO valor de IPVA da Caminhonete é %.2f", vlrIpva);

    }

    public void AdicionalVeiculo(){
        double vlrAdicional = 0;
        if (getTamanho() > 4){
            vlrAdicional = getValor() * (2/100.00);

        } else if (getTamanho() <= 4) {
            vlrAdicional = 0;
        }

        System.out.printf("\nO valor adicional da Caminhoete é %.2f", vlrAdicional);
    }

    public void Seguro(){
        double vlrSeguro = 0;
        if (getAno() > 2009){
            vlrSeguro = getValor() * (10/100.00);

        } else if (getAno() < 2009) {
            vlrSeguro = getValor() * (5/100.00);
        }

        System.out.printf("\nO valor do Seguro da Caminhonete é %.2f", vlrSeguro);
    }

    
}
