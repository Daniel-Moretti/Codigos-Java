//Crie uma classe que leia a idade de uma pessoa expressa em anos, meses e dias e
// mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anos, meses, dias;

        System.out.print("Digite sua idade em anos: ");
        anos = teclado.nextInt();
        System.out.print("Meses: ");
        meses = teclado.nextInt();
        System.out.print("dias: ");
        dias = teclado.nextInt();

        System.out.printf("Se passaram %d dias desde o seu nascimento.", (anos*365)+(meses*30)+dias);


    }

}
