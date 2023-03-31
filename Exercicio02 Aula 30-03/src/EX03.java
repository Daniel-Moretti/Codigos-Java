//Faça um programa, utilizando for, que peça para o usuário informar um número e
// mostre na tela todos os números ímpares até o número.
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro para saber todos os ímpares até o número digitado: ");
        num = teclado.nextInt();

        for(int cont = 0; cont<=num; cont++){
            if (cont%2 != 0){
                System.out.printf("%d é impar\n", cont);
            }
        }


    }

}
