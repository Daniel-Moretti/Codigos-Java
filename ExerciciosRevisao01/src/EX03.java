//Crie uma classe que receba o nome de um produto, preço, percentual de desconto e quantidade,
// calcule o desconto e imprima na tela o nome do produto,o valor do produto, o valor do desconto,
// a quantidade e o valor final com desconto.

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        String produto;
        double precoUnit, percDesc, quant, vlrDesc, vlrFinal;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        produto = teclado.nextLine();

        System.out.print("Digite o preço unitário do produto (R$): ");
        precoUnit = teclado.nextDouble();

        System.out.print("Digite o percentual de desconto deste produto: ");
        percDesc = teclado.nextDouble();
        vlrDesc = (percDesc/100)*precoUnit;

        System.out.print("Digite a quantidade comprada: ");
        quant = teclado.nextDouble();

        vlrFinal = (precoUnit -vlrDesc) * quant;

        System.out.println("\nRelatório da compra:");
        System.out.printf("\nProduto: %s", produto);
        System.out.printf("\nValor Total s/ desconto: %.2f", precoUnit*quant);
        System.out.printf("\nValor do desconto: %.2f", vlrDesc*quant);
        System.out.printf("\nQuantidade comprada: %.2f", quant);
        System.out.printf("\nValor Total da compra com desconto: %.2f", vlrFinal);


    }

}
