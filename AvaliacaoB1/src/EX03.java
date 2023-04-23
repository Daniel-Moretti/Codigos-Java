import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com um numero de 1 a 10: ");
        numero = teclado.nextInt();

        switch (numero){
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SETE");
                break;
            case 8:
                System.out.println("OITO");
                break;
            case 9:
                System.out.println("NOVE");
                break;
            case 10:
                System.out.println("DEZ");
                break;
            default:
                System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
        }


    }

}
