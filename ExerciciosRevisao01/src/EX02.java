// Crie uma classe que receba 05 números e apresente a média entre eles.

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        double num1, num2, num3, num4, num5;
        double resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 5 numeros para saber a média entre eles.");
        System.out.print("1º número:");
        num1= entrada.nextDouble();

        System.out.print("\n2º número:");
        num2= entrada.nextDouble();

        System.out.print("\n3º número:");
        num3= entrada.nextDouble();

        System.out.print("\n4º número:");
        num4= entrada.nextDouble();

        System.out.print("\n5º número:");
        num5= entrada.nextDouble();

        resultado = (num1 + num2 + num3 + num4 + num5)/5;
        System.out.printf("\nA média é: %.2f", resultado);

    }

}
