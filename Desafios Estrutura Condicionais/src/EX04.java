import java.util.Scanner;

/*4.  Faça um programa que leia três números e mostre-os em ordem decrescente.

 */
public class EX04 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int maior = 0;
        int menor = 0;
        int meio = 0;

        Scanner teclado = new Scanner(System.in);

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

        if (maior != num1 && menor != num1){
            meio = num1;
        } else if (maior != num2 && menor != num2) {
            meio = num2;
        } else {
            meio = num3;
        }

        System.out.printf("Os números em ordem decrescente são: %s - %s - %s ", maior, meio, menor);


    }

}
