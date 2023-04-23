//Crie uma classe que receba  um número  e some 8 caso seja par ou some 7 caso seja ímpar,
// imprimir o resultado desta operação.


import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        double num;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro e positivo: ");
        num = teclado.nextDouble();

        if (num%2==0) {
            num += 8;
        } else {
            num += 7;
        }

        System.out.printf("Resultado: %.2f", num);



    }


}
