/*Crie uma classe que receba dois numeros e apresente a soma, divisao, subtração e multiplicação
deles.*/

package br.com.aula01;
import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        double soma = numero1 + numero2;

        double divisao = numero1 / numero2;

        double subtracao = numero1 - numero2;

        double multiplicacao = numero1 * numero2;

        System.out.printf("A soma dos numeros digitados é: %.2f\n", soma);
        System.out.printf("A divisão dos numeros digitados é: %.2f\n", divisao);
        System.out.printf("A subtração dos numeros digitados é: %.2f\n", subtracao);
        System.out.printf("A multiplicação dos numeros digitados é: %.2f\n", multiplicacao);

    }



}
