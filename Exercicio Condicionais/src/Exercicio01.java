import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int num = 1;
        String cor = "";

        Scanner teclado = new Scanner(System.in);

        while (num != 0) {
            System.out.println("\nMENU DE OPÇÕES");
            System.out.println(
                    """
                            1- Verde
                            2- Vermelho
                            3- Azul
                            """
            );
            System.out.println("Digite a opção desejada: ");
            num = teclado.nextInt();



            if (num == 1) {
                cor = "Verde";
            } else if (num == 2) {
                cor = "Vermelho";
            } else if (num == 3) {
                cor = "Azul";
            } else if (num != 0){
                System.out.print("Opção incorreta.");
            }

            System.out.printf("Você selecionou a cor %s", cor);

        }
        System.out.print("Encerrando.");


    }

}
