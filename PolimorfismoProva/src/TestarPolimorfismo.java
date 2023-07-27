import java.util.Scanner;

public class TestarPolimorfismo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o codigo do livro Romance: ");
        int codRomance = teclado.nextInt();

        System.out.println("Digite o nome do livro Romance: ");
        String nomeRomance = teclado.next();

        System.out.println("Digite o valor do livro Romance: ");
        double valorRomance = teclado.nextDouble();

        System.out.println("Digite os dias de atraso do livro Romance: ");
        int diasAtrasoRomance = teclado.nextInt();

        Romance romance = new Romance(codRomance, diasAtrasoRomance, nomeRomance, valorRomance);

        System.out.println("\n\nO livro " + romance.getNome() + " esta atrasado " + romance.getDiasAtraso() + " dias.");
        System.out.println("Baseado no valor do livro que é R$ " + romance.getValor() + ".");
        romance.CalcularMulta();

        System.out.println("\nDigite o codigo do livro Literatura: ");
        int codLit = teclado.nextInt();

        System.out.println("Digite o nome do livro Literatura: ");
        String nomeLit = teclado.next();

        System.out.println("Digite o valor do livro Literatura: ");
        double valorLit = teclado.nextDouble();

        System.out.println("Digite os dias de atraso do livro Literatura: ");
        int diasAtrasoLit = teclado.nextInt();

        Literatura literatura = new Literatura(codLit, diasAtrasoLit, nomeLit, valorLit);

        System.out.println("\nO livro " + literatura.getNome() + " esta atrasado " + literatura.getDiasAtraso() + " dias");
        System.out.println("Baseado no valor do livro que é R$ " + literatura.getValor() + ".");
        literatura.CalcularMulta();


    }


}
