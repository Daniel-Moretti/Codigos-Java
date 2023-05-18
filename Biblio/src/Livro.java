public class Livro {
    private String titulo;
    private int codigo;
    private int quantEmprestimos;
    private String status = "Disponível";

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantEmprestimos() {
        return quantEmprestimos;
    }

    public void setQuantEmprestimos(int quantEmprestimos) {
        this.quantEmprestimos += quantEmprestimos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
