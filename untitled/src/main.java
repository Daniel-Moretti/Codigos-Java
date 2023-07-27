import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Quadrado figura1 = new Quadrado();
        Circulo figura2 = new Circulo();

        System.out.println("Digite a cor do quadrado: ");
        figura1.setColor(teclado.next());

        System.out.println("Digite o valor do lado do quadrado: ");
        figura1.setLado(teclado.nextDouble());

        figura1.area();
        System.out.println("E a cor é: " + figura1.getColor());

        System.out.println("Digite a cor do círculo: ");
        figura2.setColor(teclado.next());

        System.out.println("Digite o valor do raio do círculo: ");
        figura2.setRaio(teclado.nextDouble());

        figura2.area();
        System.out.println("E a cor é: " + figura2.getColor());


    }


}
