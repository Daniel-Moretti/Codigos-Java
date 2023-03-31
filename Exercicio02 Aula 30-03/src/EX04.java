import java.util.Scanner;

//Faça um programa, utilizando for, que permita o usuário fazer três contas de subtração.
public class EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.println("Atenção você poderá fazer somente 3 contas de subtração.");
        for(int cont = 1; cont<4; cont++){
            System.out.printf("\nConta %d\n", cont);
            System.out.print("Digite o 1º número: ");
            num1 = teclado.nextDouble();

            System.out.print("Digite o 2º número: ");
            num2 = teclado.nextDouble();

            resultado = num1 - num2;

            System.out.printf("Resposta: %.2f", resultado);
        }
        System.out.println("\nFim do programa.");



    }

}
