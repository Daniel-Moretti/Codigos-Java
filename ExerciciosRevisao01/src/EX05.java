//Crie uma classe que receba o nome de uma pessoa e o seu salário e o mês que ele entrou na
//empresa e o mês atual.  Calcule o valor que ele vai ganhar o ano todo,
// calcule o valor do décimo terceiro salário e o valor relativo a férias proporcional
//aquele tempo trabalhado, sabendo que as férias correspondem ao salário + 33 % do salário.

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        String func;
        double salario, vlrFerias;
        int mesEntrada, mesAtual, mesesTrabalhados;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do colaborador: ");
        func = teclado.nextLine();

        System.out.print("Digite o salário do colaborador: ");
        salario = teclado.nextDouble();

        System.out.print("Digite o mês de contratação do colaborador: ");
        mesEntrada = teclado.nextInt();

        System.out.print("Digite o mês atual: ");
        mesAtual = teclado.nextInt();
        mesesTrabalhados = mesAtual-mesEntrada;

        vlrFerias = ((salario+(salario*0.33))/12)*mesesTrabalhados;

        System.out.println("RELATÓRIO");
        System.out.printf("Nome do colaborador: %s", func);
        System.out.printf("\nSalário de 1 ano inteiro: R$ %.2f", salario*12);

        System.out.printf("\nSalário ganho até o mês atual: R$ %.2f", salario*mesesTrabalhados);

        System.out.printf("\nValor do 13º Salário proporcional à %d meses trabalhados: R$ %.2f", mesesTrabalhados, ((salario/12)*mesesTrabalhados));

        System.out.printf("\nValor das férias proporcional à %d meses trabalhados: R$ %.2f", mesesTrabalhados, vlrFerias);

    }

}
