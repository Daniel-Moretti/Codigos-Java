/*3.  Faça um programa que pergunte o preço de três produtos e informe qual produto você deve
comprar, sabendo que a decisão é sempre o mais barato.
 */
import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
        double preco1;
        double preco2;
        double preco3;
        double maior = 0;
        double menor = 0;
        String produtoEscolhido = "";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o preço de 3 produtos.");
        System.out.print("Digite o preço do produto 1: ");
        preco1 = teclado.nextDouble();
        System.out.print("Digite o preço do produto 2: ");
        preco2 = teclado.nextDouble();
        System.out.print("Digite o preço do produto 3: ");
        preco3 = teclado.nextDouble();

        if (preco1 < preco2 && preco1 < preco3){
            menor = preco1;
            produtoEscolhido = "Produto 1";
        } else if (preco2 < preco1 && preco2 < preco3) {
            menor = preco2;
            produtoEscolhido = "Produto 2";
        } else {
            menor = preco3;
            produtoEscolhido = "Produto 3";
        }
        System.out.printf("Você deve comprar o produto %s", produtoEscolhido);


    }

}
