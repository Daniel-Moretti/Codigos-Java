//Crie uma classe que receba um número e encontre o dobro dele caso ele seja positivo e o
// seu triplo caso seja negativo, imprimindo o resultado.

import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {
        double num;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número (positivo ou negativo): ");
        num = teclado.nextFloat();

        if (num>0) {
            System.out.printf("O numero digitado é maior que zero então o dobro dele é: %.2f", num * 2);
        } else if (num<0) {
            System.out.printf("O numero digitado é menor que zero então o triplo dele é: %.2f", num * 3);
        } else {
            System.out.print("\nO número digitado não pode ser 0 (zero).");
        }





    }

}
