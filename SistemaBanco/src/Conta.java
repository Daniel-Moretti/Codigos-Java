import java.io.Serializable;

public class Conta{
    private int id;
    private Integer numerConta;
    private String nome;
    private  double valor;

    public Conta(){
        this.id = 0;
        this.numerConta = 0;
        this.nome = "";
        this.valor = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNumerConta() {
        return numerConta;
    }

    public void setNumerConta(Integer numerConta) {
        this.numerConta = numerConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void sacar(double valor){
        this.valor -= valor;
        System.out.println("Saque realizado com sucesso! Novo saldo" + this.valor);
    }

    public void depositar(double valor){
        this.valor += valor;
        System.out.println("Depósito realizado com sucesso! Novo saldo" + this.valor);
    }

}
