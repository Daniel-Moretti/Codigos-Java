public abstract class Plano {

    private int codUsuario;
    private String nome;
    private Double vlrPadrao;

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVlrPadrao() {
        return vlrPadrao;
    }

    public void setVlrPadrao(Double vlrPadrao) {
        this.vlrPadrao = vlrPadrao;
    }

    public abstract double CalcularMensalidade();
}
