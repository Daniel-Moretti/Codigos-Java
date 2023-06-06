import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valor;
        int opcao = 0;

        List<Conta> conta = new ArrayList<>();

        while (opcao != 10) {
            System.out.println("""
                $$$$$$$$$$$$$$$ MENU DE OPÇÕES $$$$$$$$$$$$$$$$$$$$
                1- Cadastrar Conta.
                2- Sacar.
                3- Depositar.
                4- Mostrar Saldo.
                5- Sair.
                $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$""");
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 :
                    Conta cadastrar = new Conta();
                    cadastrar = CadastrarConta(conta);

                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    opcao = 10;
                    break;
            }

        }


        public static List CadastrarConta(List<conta> conta) {
            Conta cadastrar = new Conta();
            System.out.println("Código: ");
            cadastrar.setCodigo(teclado.nextInt());
            System.out.println("Numero Conta: ");
            cadastrar.setNumeroConta(teclado.next());
            System.out.println("Nome Cliente: ");
            cadastrar.setNomeCliente(teclado.next());
            System.out.println("Saldo incial: ");
            cadastrar.setSaldo(teclado.nextFloat());
            conta.add(cadastrar);
            return;
        }

        for (int i = 0; i<conta.size(); i++) {
            Conta cc = conta.get(i);
            System.out.println(cc.getNomeCliente());
        }


    }


}
