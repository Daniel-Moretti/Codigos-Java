import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("Informe o numero 1");
        numero1 = teclado.nextInt();

        System.out.println("Informe o numero 2");
        numero2 = teclado.nextInt();

        System.out.println("Informe o numero 3");
        numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero2 > numero3){
            System.out.println();
        }

    }


}
