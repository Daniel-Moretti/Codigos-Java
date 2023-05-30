import java.util.Scanner;

public class Venda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();

        float totalGeralVenda = 0;

        int opcao = 0;

        while (opcao != 100) {

            System.out.println("""
                MENU:
                1- Cadastrar Produtos.
                2- Alterar Preço.
                3- Alterar Estoque.
                4- Realizar venda.
                5- Mostrar Lista de Produtos.
                6- Relatorio de venda.
                7- Sair.""");
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    produto1 = CadastrarProdutos(new Produto(), 1, 10);
                    produto2 = CadastrarProdutos(new Produto(), 2, 20);
                    produto3 = CadastrarProdutos(new Produto(), 3, 30);
                    produto4 = CadastrarProdutos(new Produto(), 4, 40);
                    break;
                case 2:
                    int codAlterPreco;
                    System.out.println("Escolha o código do produto que deseja alterar o preço: ");
                    codAlterPreco = teclado.nextInt();
                    switch (codAlterPreco) {
                        case 10 :
                            System.out.println(produto1.getNome());
                            System.out.print("Digite o novo preço: ");
                            produto1.setPreco(teclado.nextFloat());
                            break;
                        case 20 :
                            System.out.println(produto2.getNome());
                            System.out.print("Digite o novo preço: ");
                            produto2.setPreco(teclado.nextFloat());
                            break;
                        case 30 :
                            System.out.println(produto3.getNome());
                            System.out.print("Digite o novo preço: ");
                            produto3.setPreco(teclado.nextFloat());
                            break;
                        case 40 :
                            System.out.println(produto4.getNome());
                            System.out.print("Digite o novo preço: ");
                            produto4.setPreco(teclado.nextFloat());
                            break;
                    }
                    break;
                case 3:
                    int alterEstoque;
                    System.out.println("Escolha o código do produto que deseja alterar estoque: ");
                    alterEstoque = teclado.nextInt();
                    switch (alterEstoque) {
                        case 10 :
                            System.out.println(produto1.getNome());
                            System.out.print("Digite o novo estoque ([+] para aumentar) ou ([-] para diminuir): ");
                            produto1.setEstoque(teclado.nextFloat());
                            break;
                        case 20 :
                            System.out.println(produto2.getNome());
                            System.out.print("Digite o novo estoque ([+] para aumentar) ou ([-] para diminuir): ");
                            produto2.setEstoque(teclado.nextFloat());
                            break;
                        case 30 :
                            System.out.println(produto3.getNome());
                            System.out.print("Digite o novo estoque ([+] para aumentar) ou ([-] para diminuir): ");
                            produto3.setEstoque(teclado.nextFloat());
                            break;
                        case 40 :
                            System.out.println(produto4.getNome());
                            System.out.print("Digite o novo estoque ([+] para aumentar) ou ([-] para diminuir): ");
                            produto4.setEstoque(teclado.nextFloat());
                            break;
                    }
                    break;
                case 4:
                    int codigo;
                    System.out.println("\n########################################################################################");
                    System.out.print("Digite o codigo do produto que deseja comprar: ");
                    codigo = teclado.nextInt();
                    switch (codigo) {
                        case 10 :
                            produto1.Vender(produto1);
                            break;
                        case 20 :
                            produto2.Vender(produto2);
                            break;
                        case 30 :
                            produto3.Vender(produto3);
                            break;
                        case 40 :
                            produto4.Vender(produto4);
                            break;
                        default:
                            System.out.println("Código não existe. Tente novamente.");
                    }
                    break;
                case 5:
                    System.out.println("#################################### Lista de Produtos ####################################");
                    ListaProdutos(produto1);
                    ListaProdutos(produto2);
                    ListaProdutos(produto3);
                    ListaProdutos(produto4);
                    System.out.println("###########################################################################################");
                    break;
                case 6 :
                    System.out.println("############################### RELATÓRIO FINAL DE VENDA ###############################");
                    Relatorio(produto1);
                    Relatorio(produto2);
                    Relatorio(produto3);
                    Relatorio(produto4);
                    System.out.println("TOTAL FATURADO: R$ "+ totalGeralVenda);
                    System.out.println("########################################################################################");
                    break;
                case 7 :
                    opcao = 100;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }


            totalGeralVenda = produto1.getFaturado() + produto2.getFaturado() + produto3.getFaturado() + produto4.getFaturado();

        }

    }

    public static Produto CadastrarProdutos(Produto produto, int id, int cod){
        Scanner teclado = new Scanner(System.in);

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

    public static void Relatorio(Produto produto) {
        System.out.println("Codigo: " + produto.getCodigo() + " - Nome: " + produto.getNome() +
                " - Estoque Atual: " + produto.getEstoque() +
                " - Total faturado por este produto: R$ " + produto.getFaturado());
    }




}
