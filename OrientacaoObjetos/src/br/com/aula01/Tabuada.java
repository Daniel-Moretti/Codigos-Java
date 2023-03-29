/*Desafio: Crie uma classe que receba um número e apresente a tabuada dele.*/

package br.com.aula01;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver a tabuada dele: ");
        int numero1 = entrada.nextInt();

        for (int x = 1; x <= 10; x++){
            int resultado = (numero1 * x);
            System.out.printf("%d * %d = %d\n", numero1, x, resultado);
        }

        }




}
