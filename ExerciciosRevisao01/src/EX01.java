//Crie uma classe que receba 04 números e apresente a soma, divisão, subtração e multiplicação deles.

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        double num1, num2, num3, num4;
        double resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 4 numeros para saber a soma, divisão, subtração e multiplicação deles.");
        System.out.print("1º número:");
        num1= entrada.nextDouble();

        System.out.print("\n2º número:");
        num2= entrada.nextDouble();

        System.out.print("\n3º número:");
        num3= entrada.nextDouble();

        System.out.print("\n4º número:");
        num4= entrada.nextDouble();

        System.out.println("\nRESULTADOS:");


        resultado = num1 + num2 + num3 + num4;
        System.out.printf("\n%.2f + %.2f + %.2f + %.2f = %.2f", num1, num2, num3, num4, resultado);

        resultado = num1 / num2 / num3 / num4;
        System.out.printf("\n%.2f / %.2f / %.2f / %.2f = %.2f", num1, num2, num3, num4, resultado);

        resultado = num1 - num2 - num3 - num4;
        System.out.printf("\n%.2f - %.2f - %.2f - %.2f = %.2f", num1, num2, num3, num4, resultado);

        resultado = num1 * num2 * num3 * num4;
        System.out.printf("\n%.2f * %.2f * %.2f * %.2f = %.2f", num1, num2, num3, num4, resultado);


    }


}
