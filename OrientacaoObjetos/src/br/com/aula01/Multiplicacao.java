package br.com.aula01;
import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = entrada.nextDouble();

        double resultado = numero1 * numero2 * numero3;

        System.out.printf("O resultado da multiplicação é %.2f", resultado);

    }


}
