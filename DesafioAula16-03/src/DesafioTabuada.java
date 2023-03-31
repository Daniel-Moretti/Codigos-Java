import java.util.Scanner;

public class DesafioTabuada {
    public static void main(String[] args) {
        int num;
        int tabuada;
        int resultado;
        Scanner entrada = new Scanner(System.in);


        System.out.println("TABUADA");

        System.out.println("Digite o número para ver a tabuada dele ('0' para sair):");
        num = entrada.nextInt();

        while (num != 0){
            for (tabuada = 1; tabuada <= 10; tabuada++){
                resultado = num * tabuada;
                System.out.printf("%d x %d = %d\n", num, tabuada, resultado);
            }
            System.out.println("Digite o número para ver a tabuada dele ('0' para sair):");
            num = entrada.nextInt();
        }
        System.out.println("FIM DO PROGRAMA.");





    }


}
