import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        int opcao;
        String prato="", bebida="";
        Scanner teclado = new Scanner(System.in);

        System.out.println("MENU");
        System.out.print("Pratos:" +
                "\n(1) - Arroz, Feijão e Carne." +
                "\n(2) - Macarrão, Carne de Frango e Mandioca." +
                "\n(3) - Arroz, Maionese e Carne Assada.");
        System.out.print("\nSelecione sua opção de prato: ");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                prato = "Arroz, Feijão e Carne";
                break;
            case 2:
                prato = "Macarrão, Carne de Frango e Mandioca";
                break;
            case 3:
                prato = "Arroz, Maionese e Carne Assada";
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        System.out.print("Bebidas:" +
                "\n(1) - Coca-Cola." +
                "\n(2) - Suco de laranja." +
                "\n(3) - Água Tônica.");
        System.out.print("\nSelecione sua opção de bebida: ");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                bebida = "Coca-Cola";
                break;
            case 2:
                bebida = "Suco de laranja";
                break;
            case 3:
                bebida = "Água Tônica";
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        System.out.println("A combinação selecionada foi: " + prato +" com " + bebida);



    }

}
