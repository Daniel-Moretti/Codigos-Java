//Crie uma classe que, receba um número informado pelo usuário, imprima a tabuada dele de 1 a 10.
// Use o formato de apresentação (considerando que o usuário informouo número 5):

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        int num, tabuada, resultado;
        Scanner entrada = new Scanner(System.in);


        System.out.println("TABUADA");

        System.out.println("Digite o número para ver a tabuada dele ('0' para sair):");
        num = entrada.nextInt();

        while (num != 0){
            for (tabuada = 1; tabuada <= 10; tabuada++){
                resultado = num * tabuada;
                System.out.print(num + " x " + tabuada + " = " + resultado + "\n");
            }
            System.out.println("Digite o número para ver a tabuada dele ('0' para sair):");
            num = entrada.nextInt();
        }
        System.out.println("FIM DO PROGRAMA.");


    }

}
