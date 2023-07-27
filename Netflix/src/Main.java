import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Plano1 plano1 = new Plano1();
        Plano2 plano2 = new Plano2();

        String nome;
        int userCod;

        System.out.println("Digite o código do usuário: ");
        userCod = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Digite o nome do usuário: ");
        nome = teclado.nextLine();

        plano1.setCodUsuario(userCod);
        plano2.setCodUsuario(userCod);

        plano1.setNome(nome);
        plano2.setNome(nome);

        int opcao = 0;

        while (opcao!=4) {
            System.out.println("""
                    \nMENU:
                    1- Escolher Plano 1
                    2- Escolher Plano 2
                    3- Sair""");
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor padrão do plano em R$: ");
                plano1.setVlrPadrao(teclado.nextDouble());

                System.out.println("#######################################");
                System.out.println("RESULTADO");
                Relatorio(1, plano1, plano2);

            } else if (opcao == 2) {
                System.out.println("Digite o valor padrão do plano em R$: ");
                plano2.setVlrPadrao(teclado.nextDouble());

                System.out.println("#######################################");
                System.out.println("RESULTADO");
                Relatorio(2, plano1, plano2);

            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida tente novamente.");
            }


        }


    }

    public static void Relatorio(int opcao, Plano1 plano1, Plano2 plano2){
        if (opcao == 1){
            double vlrPlano1 = plano1.CalcularMensalidade();
            System.out.println("Código: " + plano1.getCodUsuario());
            System.out.println("Usuário: " + plano1.getNome());
            System.out.printf("Valor do plano 1: R$ %.2f", vlrPlano1);

        } else {
            double vlrPlano2 = plano2.CalcularMensalidade();
            System.out.println("Código: " + plano2.getCodUsuario());
            System.out.println("Usuário: " + plano2.getNome());
            System.out.printf("Valor do plano 2: R$ %.2f", vlrPlano2);
        }

    }


}
