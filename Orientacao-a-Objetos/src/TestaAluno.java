import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {

        Alunos aluno = new Alunos();
        Scanner teclado = new Scanner(System.in);
        String novoNomeAluno, novoRGAluno, novaDNAluno;

        //Criando aluno;

        aluno.setNome("Daniel Moretti");
        aluno.setRg("4.160.112");
        aluno.setDataNascimento("10/11/1982");

        System.out.println("Nome inicial: " + aluno.getNome());
        System.out.println("RG inicial: "+ aluno.getRg());
        System.out.println("Data Nascimento inicial: "+ aluno.getDataNascimento());

        //Alterando dados aluno

        aluno.setNome("Samuel Moretti");
        aluno.setRg("123.456-78");
        aluno.setDataNascimento("18/03/2014");

        System.out.println("Nome novo: " + aluno.getNome());
        System.out.println("RG novo: "+ aluno.getRg());
        System.out.println("Data Nascimento novo: "+ aluno.getDataNascimento());

        System.out.println("Digite novo nome do aluno: ");
        novoNomeAluno = teclado.nextLine();

        System.out.println("Digite novo RG do aluno: ");
        novoRGAluno = teclado.nextLine();

        System.out.println("Digite nova data nascimento do aluno: ");
        novaDNAluno = teclado.nextLine();

        aluno.setNome(novoNomeAluno);
        aluno.setRg(novoRGAluno);
        aluno.setDataNascimento(novaDNAluno);

        System.out.println("Nome digitado: "+ aluno.getNome());
        System.out.println("RG digitado: "+ aluno.getRg());
        System.out.println("Data nascimento digitado: "+ aluno.getDataNascimento());

    }
}
