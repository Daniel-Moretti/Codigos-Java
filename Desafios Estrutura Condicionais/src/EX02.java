/*2. Escreva um programa em Java que receba um inteiro e diga:  é par ou ímpar
Use o operador matemático % (resto da divisão ou módulo) e o teste condicional if
 */

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número inteiro para descobrir se ele é par ou ímpar: ");
        num = teclado.nextInt();

        if (num%2 == 0){
            System.out.println("O número digitado é Par.");
        } else {
            System.out.println("O número digitado é Ímpar.");
        }


    }


}
