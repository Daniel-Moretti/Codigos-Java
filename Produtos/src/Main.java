import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Boolean loop = true;

        while (loop) {
            System.out.print("Código do produto: ");
            int cod = teclado.nextInt();

            teclado.nextLine();

            System.out.print("Descrição do produto: ");
            String desc = teclado.nextLine();

            System.out.print("Valor do produto: ");
            Double vlrProd = teclado.nextDouble();

            teclado.nextLine();

            String opcao;

            System.out.print("O produto é da (I)-Industria ou (R)-Revenda?");
            opcao = teclado.next();

            switch (opcao){
                case "I" :
                    ProdutoIndustria produtoIndustria = new ProdutoIndustria(cod, desc, vlrProd);

                    System.out.print("Digite o percentual do IPI: ");
                    produtoIndustria.setPercentualIpi(teclado.nextDouble());

                    System.out.println("RESULTADO");
                    System.out.print("\nCod. Produto: " + produtoIndustria.getCodigo());
                    System.out.print("\nDescrição: " + produtoIndustria.getDescricao());
                    System.out.print("\nValor produto se IPI: R$ " + produtoIndustria.getValor());
                    Double vlrProdComIpi = produtoIndustria.ValorProdComIpi();

                    System.out.print("\nValor do produto com IPI: R$ " + vlrProdComIpi);

                    break;

                case "R" :
                    ProdutoRevenda produtoRevenda = new ProdutoRevenda(cod, desc, vlrProd);

                    System.out.print("Digite o percentual do ICMS: ");
                    produtoRevenda.setPercentualIcms(teclado.nextDouble());

                    System.out.println("RESULTADO");
                    System.out.print("\nCod. Produto: " + produtoRevenda.getCodigo());
                    System.out.print("\nDescrição: " + produtoRevenda.getDescricao());
                    System.out.print("\nValor produto se IPI: R$ " + produtoRevenda.getValor());
                    Double vlrProdComIcms = produtoRevenda.ValorProdComIcms();

                    System.out.print("\nValor do produto com IPI: R$ " + vlrProdComIcms);

                    break;

                default:
                    System.out.println("Opção inválida.");

            }


            System.out.println("Deseja calcular novo produto? [S/N]");
            String continuar = "";
            continuar = teclado.next();
            if (continuar.equalsIgnoreCase("N")){
                loop = false;
            } else if (continuar.equalsIgnoreCase("S")) {
                loop = true;
            }

        }


    }
}
