//Faça uma classe que desenhe na tela losangos ou triângulos utilizando somente o caractere “%”.
// O usuário é quem escolhe o que deve ser impresso. O usuário também deve ter a opção de escolher
// o tamanho (em linhas) da figura a ser desenhada
// Código criado pelo ChatGPT com um toque meu


import java.util.Scanner;

public class EX05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\nDigite o tipo de figura (L para losango ou T para triângulo) ['Sair' para Encerrar]: ");
            String tipo = input.next().toUpperCase();

            if (tipo.equals("SAIR")){
                break;
            }

            System.out.print("Digite o tamanho da figura em linhas (para o Losango deve ser número ímpar): ");
            int tamanho = input.nextInt();

            if (tipo.equals("L") && (tamanho%2==1)) {
                desenharLosango(tamanho);
            } else if (tipo.equals("T")) {
                desenharTriangulo(tamanho);
            } else {
                System.out.println("Tipo inválido. Digite L para losango ou T para triângulo.\nLembre-se o Losango deve ter tamanho ímpar.");
            }
        }

    }

    public static void desenharLosango(int tamanho) {
        int espacos = tamanho / 2;
        int percent = 1;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < percent; j++) {
                System.out.print("%");
            }
            System.out.println();

            if (i < tamanho / 2) {
                espacos--;
                percent += 2;
            } else {
                espacos++;
                percent -= 2;
            }
        }
    }

    public static void desenharTriangulo(int tamanho) {
        int espacos = tamanho - 1;
        int percent = 1;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < percent; j++) {
                System.out.print("%");
            }
            System.out.println();

            espacos--;
            percent += 2;
        }
    }
}
