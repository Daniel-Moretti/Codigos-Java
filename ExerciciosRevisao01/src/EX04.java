//Crie uma classe que receba 1 número e imprima o seu antecessor e o seu sucessor

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        int num, antecessor, sucessor;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para saber seu antecessor e sucessor: ");
        num = teclado.nextInt();

        antecessor = num-1;
        sucessor = num+1;

        System.out.printf("O %d é o antecessor de %d.", antecessor, num);

        System.out.printf("\nO %d é o sucessor de %d.", sucessor, num);

    }

}
