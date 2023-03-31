import java.util.Scanner;

/*1. Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor.
Consegue criar mais de uma solução?*/
public class EX01 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int maior = 0;
        int menor = 0;
        String reiniciar = "s";

        while (reiniciar.equals("s")){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Você vai digitar 3 numeros inteiros para descobrir qual deles é o maior.");

            System.out.print("Digite o primeiro numero: ");
            num1 = teclado.nextInt();

            System.out.print("Digite o segundo numero: ");
            num2 = teclado.nextInt();

            System.out.print("Digite o terceiro numero: ");
            num3 = teclado.nextInt();

            if (num1 > num2 && num1 > num3){
                maior = num1;
            } else if (num2 > num1 && num2 > num3) {
                maior = num2;
            } else {
                maior = num3;
            }
            if (num1 < num2 && num1 < num3){
                menor = num1;
            } else if (num2 < num1 && num2 < num3) {
                menor = num2;
            } else {
                menor = num3;
            }
            System.out.printf("O %d é o numero maior e o %d é o número menor.\n\n", maior, menor);
            System.out.print("Deseja reiniciar o programa? [s/n]");
            reiniciar = teclado.next();

        }





    }



}
