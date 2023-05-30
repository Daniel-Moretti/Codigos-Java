import java.util.Scanner;

public class Produto {
    private String nome;
    private int codigo;
    private float preco;
    private float estoque;
    private float faturado;

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

    public void setFaturado(float faturado) {
        this.faturado += faturado;
    }

    public float getFaturado() {
        return faturado;
    }

    public void Vender(Produto produto) {
        Scanner teclado = new Scanner(System.in);

        float quant, total;

        System.out.print("Digite a quantidade que deseja comprar: ");
        quant = teclado.nextFloat();
        produto.setEstoque(-quant);
        total = quant * produto.getPreco();
        System.out.println("Total deste produto : R$ " + (getFaturado()+total));
        produto.setFaturado(total);
    }


}
