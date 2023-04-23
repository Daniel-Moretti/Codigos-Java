//Faça uma classe que receba 5 valores, um de cada vez, e conta quantos destes valores são negativos,
// escrevendo esta informação


import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, count=0;

        System.out.print("Digite 5 numeros inteiros positivos ou negativos: ");

        for (int x=1; x<6; x++) {
            System.out.print("\n"+x+"º número: ");
            num = teclado.nextInt();
            if (num<0){
                count += 1;
            }
        }
        System.out.println("Total de números negativos digitados: " +count);


    }
}
