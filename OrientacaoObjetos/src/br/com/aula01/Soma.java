package br.com.aula01;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Informe o segundo número: ");
        double numero2 = entrada.nextDouble();

        double soma = numero1 + numero2;

        System.out.printf("A soma de %d com %2f é %2f", numero1, numero2, soma);
        //System.out.printf("A soma dos valores digitados é: %f\n", soma);

    }



}
