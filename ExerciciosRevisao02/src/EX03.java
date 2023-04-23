//Faça uma classe que leia tantos números quanto o usuário desejar e imprima a soma deles.


import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, soma=0;

        System.out.print("Digite quantos numeros quiser para saber a soma deles [0 para sair]: ");

        for (int x=1; x<1000000; x++) {
            System.out.print("\n" +x+"º número: ");
            num = teclado.nextDouble();
            if (num!=0) {
                soma += num;
                System.out.printf("Soma: %.2f\n", soma);
            } else {
                break;
            }

        }
        System.out.printf("\nResultado final: %.2f", soma);

        System.out.println("\nFim do programa!");


    }
}
