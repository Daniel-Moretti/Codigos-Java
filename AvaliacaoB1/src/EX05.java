import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        String aluno, resultado;
        double nota1, nota2, nota3, media;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        aluno = teclado.nextLine();

        System.out.print("Digite a nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = teclado.nextDouble();

        System.out.print("Digite a nota 3: ");
        nota3 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media<6){
            resultado = "Reprovado";
        } else if (media>=6 && media<=7) {
            resultado = "Em Recuperação";
        } else {
            resultado = "Aprovado";
        }

        System.out.print("\nAluno: " + aluno);

        System.out.printf("\nMédia: %.2f", media);

        System.out.print("\nResultado: " + resultado);

    }


}
