import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        String nome;

        Scanner teclado = new Scanner(System.in); //cria objeto a partir da classe Scanner

        System.out.print(" Diga o meu nome: ");
        nome = teclado.nextLine();

        System.out.print(" O nome completo é: " + nome); //Este print não quebra linha

        System.out.println(" O nome completo é: " + nome); //Este print quebra linha

        System.out.printf(" O nome completo é: %s", nome);



    }


}
