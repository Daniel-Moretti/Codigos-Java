import java.util.Scanner;

public class Venda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Produto produto1 = CadastrarProdutos(new Produto(), 1, 10, teclado);
        Produto produto2 = CadastrarProdutos(new Produto(), 2, 20, teclado);
        Produto produto3 = CadastrarProdutos(new Produto(), 3, 30, teclado);
        Produto produto4 = CadastrarProdutos(new Produto(), 4, 40, teclado);



        int venda;

        for (venda=1; venda < 4; venda++) {
            int codigo;
            System.out.println("#################################### Lista de Produtos ####################################");
            ListaProdutos(produto1);
            ListaProdutos(produto2);
            ListaProdutos(produto3);
            ListaProdutos(produto4);
            System.out.println("########################################################################################");
            System.out.print("Digite o codigo do produto que deseja comprar: ");
            codigo = teclado.nextInt();
            switch (codigo) {
                case 10 :
                    Vender(produto1, teclado);
            }

        }


    }

    public static Produto CadastrarProdutos(Produto produto, int id, int cod, Scanner teclado){
        //Scanner teclado = new Scanner(System.in);

        System.out.println("Cadastrar produto " + id);

        produto.setCodigo(cod);
        System.out.println("Código: " + cod);
        System.out.print("Nome: ");
        produto.setNome(teclado.next());
        System.out.print("Preço: R$ ");
        produto.setPreco(teclado.nextFloat());
        System.out.print("Estoque inicial: ");
        produto.setEstoque(teclado.nextFloat());

        return produto;
    }



    public static void ListaProdutos(Produto produto) {
        System.out.println("Codigo: " + produto.getCodigo() + " - Nome: " + produto.getNome() +
            " - Preço: R$ " + produto.getPreco() + " - Estoque: " + produto.getEstoque());


    }

    public static void Vender(Produto produto, Scanner teclado) {

        float quant;
        System.out.print("Digite a quantidade que deseja comprar: ");
        quant = teclado.nextFloat();
        produto.setEstoque(quant);
    }
}
