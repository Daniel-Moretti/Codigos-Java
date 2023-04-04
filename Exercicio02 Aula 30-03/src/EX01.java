import java.util.Scanner;

//Imprima na tela o seu nome e sobrenome  Nome do Cachorro 30 vezes.
public class EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, sobrenome, nomeCachorro;

        System.out.print("Informe seu nome: ");
        nome = teclado.next();

        System.out.print("Informe seu sobrenome: ");
        sobrenome = teclado.next();

        System.out.print("Informe o nome do seu pet: ");
        nomeCachorro = teclado.next();

        for (int cont = 1; cont<31; cont++){
            System.out.println(cont + " - Nome: " + nome + " Sobrenome: " + sobrenome + " Nome do pet: " + nomeCachorro);

        }
        System.out.println("...Fim do For...");


    }


}
