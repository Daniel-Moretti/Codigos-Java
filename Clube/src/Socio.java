public class Socio {
    private String nome;
    private int idade, numDependentes;
    private Double valorPadraoTitulo;

    public Socio(String nome, int idade, int numDependentes, Double valorPadraoTitulo) {
        this.nome = nome;
        this.idade = idade;
        this.numDependentes = numDependentes;
        this.valorPadraoTitulo = valorPadraoTitulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getnumDependentes() {
        return numDependentes;
    }

    public void setnumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public Double getValorPadraoTitulo() {
        return valorPadraoTitulo;
    }

    public void setValorPadraoTitulo(Double valorPadraoTitulo) {
        this.valorPadraoTitulo = valorPadraoTitulo;
    }

}
