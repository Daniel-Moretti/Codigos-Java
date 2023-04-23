import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        String nome, cpf, telefone;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite seu CPF: ");
        cpf = teclado.nextLine();

        System.out.println("Digite seu telefone: ");
        telefone = teclado.nextLine();

        System.out.println(nome + " - " + cpf + " - " + telefone);


    }

}
