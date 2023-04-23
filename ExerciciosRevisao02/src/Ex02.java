//Modifique o a classe anterior, de maneira que o usuário também informe o início e o fim da tabuada.
// Por exemplo: usuário solicitando a tabuada do número 6, com início em 5 e fim em 8


import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int num=1, tabuada, resultado, inicioTabuada, fimTabuada;
        Scanner entrada = new Scanner(System.in);


        System.out.println("TABUADA");



        while (num != 0){
            System.out.println("Digite o número para ver a tabuada dele ('0' para sair):");
            num = entrada.nextInt();

            if (num==0){
                break;
            }

            System.out.println("Digite o inicio da tabuada: ");
            inicioTabuada = entrada.nextInt();

            System.out.println("Digite o fim da tabuada: ");
            fimTabuada = entrada.nextInt();

            for (tabuada = inicioTabuada; tabuada <= fimTabuada; tabuada++){
                resultado = num * tabuada;
                System.out.print(num + " x " + tabuada + " = " + resultado + "\n");
            }
        }
        System.out.println("FIM DO PROGRAMA.");



    }


}
