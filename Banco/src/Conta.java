public class Conta {
    private int codigo;
    private String numero;
    private String nomeCliente;
    private float saldo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumeroConta(String numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void Sacar (float valor) {
        this.saldo -= valor;
    }

    public void Depositar (float valor) {
        this.saldo += valor;
    }


}
