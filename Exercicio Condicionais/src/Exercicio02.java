import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double nota;

        System.out.println("Informe a nota do aluno: ");
        nota = teclado.nextDouble();

        if (nota>=7.0){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }



    }


}
