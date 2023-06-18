import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        Integer rg;
        Date dataNascimento;


        System.out.println("Informe o nome do aluno: ");
        nome = teclado.nextLine();

        System.out.println("Informe o rg do aluno: ");
        rg = teclado.nextInt();

        System.out.println("Informe a data de nascimento do aluno: ");
        dataNascimento = formataData(teclado.next());

        Aluno aluno = new Aluno(1, nome, rg, dataNascimento);

        System.out.println("Informe o número da matrícula: ");
        aluno.setMatricula(teclado.nextInt());

        /**************
         * Professor *
         *************/
        teclado.nextLine(); //Esvaziar o Buffer do teclado (deve ser usado após uma leitura de inteiro e antes de ler String

        System.out.println("Informe o nome do professor: ");
        nome = teclado.nextLine();

        System.out.println("Informe o rg do professor: ");
        rg = teclado.nextInt();

        System.out.println("Informe a data de nascimento do professor: ");
        dataNascimento = formataData(teclado.next());

        Professor professor = new Professor(1, nome, rg, dataNascimento);

        System.out.println("Informe o salário do professor: ");
        professor.setSalario(teclado.nextDouble());

        teclado.nextLine();

        System.out.println("Informe a disciplina: ");
        professor.setDisciplina(teclado.nextLine());

        /**************
         * Funcionário *
         *************/

        System.out.println("Informe o nome do funcionário: ");
        nome = teclado.nextLine();

        System.out.println("Informe o rg do funcionário: ");
        rg = teclado.nextInt();

        System.out.println("Informe a data de nascimento do funcionário: ");
        dataNascimento = formataData(teclado.next());

        Funcionario funcionario = new Funcionario(1, nome, rg, dataNascimento);

        System.out.println("Informe o salário do funcionário: ");
        funcionario.setSalario(teclado.nextDouble());

        teclado.nextLine();

        System.out.println("Informe o cargo: ");
        funcionario.setCargo(teclado.nextLine());


        /**************************
         * Apresentar Informações *
         **************************/

        System.out.println("\n************ Informações do professor ************");
        System.out.println("Código: " + professor.getId() + "\nNome: " + professor.getNome() + "\nRG: " + professor.getRg());
        System.out.println("\nData de nascimento: " + dateString(professor.getDataNascimento()) + "\nDisciplina: " + professor.getDisciplina() + "\nSalário: R$ " + professor.getSalario());

        System.out.println("\n************ Informações do aluno ************");
        System.out.println("Código: " + aluno.getId() + "\nNome: " + aluno.getNome() + "\nRG: " + aluno.getRg());
        System.out.println("\nData de nascimento: " + dateString(aluno.getDataNascimento()) + "\nMatrícula: " + aluno.getMatricula());

        System.out.println("\n************ Informações do funcionário ************");
        System.out.println("Código: " + funcionario.getId() + "\nNome: " + funcionario.getNome() + "\nRG: " + funcionario.getRg());
        System.out.println("\nData de nascimento: " + dateString(funcionario.getDataNascimento()) + "\nCargo: " + funcionario.getCargo() + "\nSalário: R$ " + funcionario.getSalario());



    }

    public static Date formataData(String data) {
        Date dataRetorno = new Date();
        try {
            DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyy");
            dataRetorno = dataFormatada.parse(data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return dataRetorno;

    }

    public static String dateString(Date data) {
        String dataRetorno = "";
        try {
            DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyy");
            dataRetorno = dataFormatada.format(data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return dataRetorno;

    }

}
