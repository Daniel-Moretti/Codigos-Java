//Crie uma classe que receba os valore A, B, C e imprima na tela se a soma de A+B é
// menor ou Maior do que C.

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;
        String resultado;

        System.out.println("Digite os valores de A, B e C solicitados abaixo.");
        System.out.print("A: ");
        a = teclado.nextFloat();

        System.out.print("B: ");
        b = teclado.nextFloat();

        System.out.print("C: ");
        c = teclado.nextFloat();

        resultado = (a+b)>c ? "maior":"menor";

        System.out.printf("A soma de A + B é %s do que C.", resultado);
    }


}
