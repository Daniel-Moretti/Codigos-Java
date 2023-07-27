public abstract class Cursos {

    private int codAluno;
    private String nomeAluno, nomeCurso;
    private double valorPadraoCurso;


    public int getCodigo() {
        return codAluno;
    }

    public void setCodigo(int codigo) {
        this.codAluno = codigo;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getValorPadraoCurso() {
        return valorPadraoCurso;
    }

    public void setValorPadraoCurso(double valorPadraoCurso) {
        this.valorPadraoCurso = valorPadraoCurso;
    }

    public abstract double CalcularMensalidade();

}
