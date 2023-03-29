import java.util.Scanner;

public class Exercicio_Rua {
    public static void main(String[] args) {
        String rua;
        String bairro;
        int numCasa;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome da sua rua: ");
        rua = entrada.nextLine();

        System.out.println("Digite o nome do seu bairro: ");
        bairro = entrada.nextLine();

        System.out.println("Digite o numero da sua casa: ");
        numCasa = entrada.nextInt();

        System.out.printf("Voce mora na Rua %s, no bairro %s e na casa de número %d", rua, bairro, numCasa);
    }


}
