public abstract class Livro {
    private int cod, diasAtraso;
    private String nome;
    private double valor;

    public Livro(int cod, int diasAtraso, String nome, double valor) {
        this.cod = cod;
        this.diasAtraso = diasAtraso;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract void CalcularMulta();

}
