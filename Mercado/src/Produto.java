public class Produto {
    private String nome;
    private int codigo;
    private float preco;
    private float estoque;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setEstoque(float estoque) {
        this.estoque += estoque;
    }

    public float getEstoque() {
        return estoque;
    }


}
