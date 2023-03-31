//Os números de Fibonacci são uma sequência de números definida recursivamente.
// O primeiro elemento da sequência é 0 e o segundo é 1.
// Os outros elementos são calculados somando os dois antecessores.
//Faça um programa que peça ao usuario um número e mostre a sequencia Fibonacci até este número.

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fib=0;
        int a=0;
        int b;
        int num;

        System.out.print("Digite um número para saber a sequência Fibonacci até ele: ");
        num = teclado.nextInt();
        System.out.print(fib + ",");
        fib = 1;

        for (int cont=0; cont<=num; cont++) {
            if (fib<=num) {
                System.out.print(fib + ",");
                b = fib;
                fib = a + b;
                a = b;
            }

        }



    }
}
