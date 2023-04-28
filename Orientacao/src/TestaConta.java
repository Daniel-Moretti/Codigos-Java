public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setLimite(1000.00);
        conta.setSaldo(500.00);
        conta.setNumero(1);

        System.out.println("Limite da conta: "+ conta.getLimite());
        System.out.println("Saldo da conta: "+ conta.getSaldo());
        System.out.println("Numero: "+ conta.getNumero());

        conta.adicionaSaldo(150.00);

        System.out.println("Novo saldo: "+ conta.getSaldo());

        conta.saque(50.00);

        System.out.println("Novo saldo: "+ conta.getSaldo());

    }

}
