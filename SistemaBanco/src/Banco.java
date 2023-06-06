import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public static void main(String args[]){
        ArrayList<Conta> listConta = criarContas();
    }

    public static ArrayList<Conta> criarContas(){
        ArrayList<Conta> listConta = new ArrayList<Conta>();
        Scanner teclado = new Scanner(System.in);
        Conta conta = new Conta();

        int opcao = 1;
        boolean habilitaSaque = false;
        boolean habilitaDeposito = false;

        while (opcao < 6){
            System.out.println("Menu");
            System.out.println("1 - Cadastrar");

            if (habilitaDeposito) {
                System.out.println("2 - Depositar");
            }

            if (habilitaSaque) {
                System.out.println("3 - Sacar");
            }

            if (habilitaDeposito) {
                System.out.println("4 - Salvar");
            }

            System.out.println("5 - Apresentar Contas");

            System.out.println("6 - Sair");

            opcao = teclado.nextInt();

            if (opcao == 1){
                conta = cadastar(listConta.size() + 1);
                habilitaDeposito = true;

                if (conta.getValor() > 0){
                    habilitaSaque = true;
                }
            }else if (opcao == 2){
                System.out.println("Valor do depósito: ");
                conta.depositar(teclado.nextDouble());
            }else if(opcao == 3){
                System.out.println("Valor do saque: ");
                conta.sacar(teclado.nextDouble());
            }else if (opcao == 4){
                listConta.add(conta);
                conta = new Conta();

                habilitaDeposito = false;
                habilitaSaque = false;
            }else if(opcao == 5){
                apresentarInformacoes(listConta);
            }

        }

        return listConta;

    }

    public static Conta cadastar(int id){
        Conta conta = new Conta();
        Scanner tecladoConta = new Scanner(System.in);
        conta.setId(id);

        System.out.println("Informe o número da conta: ");
        conta.setNumerConta(tecladoConta.nextInt());

        System.out.println("Informe o nome do cliente: ");
        conta.setNome(tecladoConta.next());

        System.out.println("Informe o depósito inicial: ");
        conta.setValor(tecladoConta.nextDouble());

        return conta;

    }

    public static void apresentarInformacoes(List<Conta> listConta){
        Conta conta = new Conta();
        int i = 0;

        while (listConta.size() > i){
            conta = listConta.get(i);
            System.out.println("************************************");
            System.out.println("Informações da conta: " + conta.getNumerConta());
            System.out.println("Nome: " + conta.getNome() + " Saldo: " + conta.getValor());
            i++;
        }

    }




}
