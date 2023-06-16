import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;

        ArrayList<Conta> listConta = new ArrayList<>();
        Conta conta;

        while (opcao != 10) {
            System.out.println("""
                $$$$$$$$$$$$$$$ MENU DE OPÇÕES $$$$$$$$$$$$$$$$$$$$
                1- Cadastrar Conta.
                2- Sacar.
                3- Depositar.
                4- Mostrar Saldo.
                5- Relatorio das Contas Cadastradas
                6- Sair.
                $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$""");
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> {
                    conta = CadastrarConta(listConta.size() + 1);
                    listConta.add(conta);
                }
                //conta = new Conta();
                case 2 -> Sacar(listConta, teclado);
                case 3 -> Depositar(listConta, teclado);
                case 4 -> MostrarSaldo(listConta, teclado);
                case 5 -> RelatorioContas(listConta);
                case 6 -> opcao = 10;
                default -> System.out.println("Opção incorreta.");
            }

        }



    }

    public static Conta CadastrarConta(int id){
        Scanner teclado = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Código: " + id);
        conta.setCodigo(id);

        System.out.print("Numero Conta: ");
        conta.setNumeroConta(teclado.nextInt());

        System.out.print("Nome Cliente: ");
        conta.setNomeCliente(teclado.next());

        System.out.print("Saldo Incial: ");
        conta.setSaldo(teclado.nextFloat());

        return conta;
    }

    public static void RelatorioContas(List<Conta> listConta){
        Conta conta = new Conta();

        for (int i=0; listConta.size() > i; i++){
            conta = listConta.get(i);
            System.out.println("************************************");
            System.out.println("Informações da conta.");
            System.out.println("Número da conta: " + conta.getNumeroConta());
            System.out.println("Nome Cliente: " + conta.getNomeCliente());
            System.out.println("Saldo: R$ " + conta.getSaldo());
        }

    }

    public static void Sacar(List<Conta> listConta, Scanner teclado){
        Conta conta = new Conta();
        System.out.print("Digite o numero da conta que deseja sacar: ");
        Integer numConta = teclado.nextInt();

        for (int i=0; listConta.size() > i; i++){
            conta = listConta.get(i);
            if (conta.getNumeroConta().equals(numConta)){
                System.out.print("Valor do saque: ");
                conta.Sacar(teclado.nextFloat());
            } else {
                System.out.println("Conta não encontrada.");
            }
        }
    }

    public static void Depositar(List<Conta> listConta, Scanner teclado){
        Conta conta = new Conta();
        System.out.print("Digite o numero da conta que deseja depositar: ");
        Integer numConta = teclado.nextInt();

        for (int i=0; listConta.size() > i; i++){
            conta = listConta.get(i);
            if (conta.getNumeroConta().equals(numConta)){
                System.out.print("Valor do depósito: ");
                conta.Depositar(teclado.nextFloat());
            } else {
                System.out.println("Conta não encontrada.");
            }
        }
    }

    public static void MostrarSaldo(List<Conta> listConta, Scanner teclado){
        Conta conta = new Conta();
        System.out.print("Digite o numero da conta que deseja visualizar o saldo: ");
        Integer numConta = teclado.nextInt();

        for (int i=0; listConta.size() > i; i++){
            conta = listConta.get(i);
            if (conta.getNumeroConta().equals(numConta)){
                System.out.println("Saldo da conta: " + conta.getSaldo() + "\n\n");

            }
        }
    }


}
