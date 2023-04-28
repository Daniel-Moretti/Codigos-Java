import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner teclado =  new Scanner(System.in);
        String nome;
        double salario;


        System.out.print("Digite o nome do funcionario: ");
        nome = teclado.next();
        funcionario.setNome(nome);

        System.out.print("Digite o salario: ");
        salario = teclado.nextDouble();
        funcionario.setSalario(salario);

        System.out.println("Nome do funcionario é: "+ funcionario.getNome());
        System.out.println("O salário do funcionário é: "+ funcionario.getSalario());


    }
}
