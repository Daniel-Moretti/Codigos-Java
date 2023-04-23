//Escrever uma classe que calcule e mostre a média aritmética dos números lidos entre 13 e 73


import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, soma=0, resultado;
        int cont=0, cont2=1;

        System.out.println("Digite números entre 13 e 73 para saber a média aritmética. ");

        while (true) {

            System.out.printf("%dº número ['0' para ver resultado]: ", cont2);

            num = teclado.nextDouble();

            if (num==0) {
                break;
            } else if (num>=13 && num<=73) {
                soma += num;
                cont++;
                cont2++;
            } else {
                System.out.print("Número digitado não está entre 13 e 73. Tente novamente. ");
            }
        }
        resultado = soma/cont;
        System.out.printf("\nA média aritmética dos números digitados é: %.2f", resultado);



    }

}
