import java.util.Date;

public class Funcionario extends Pessoa{

    public Funcionario(int id, String nome, Integer rg, Date dataNascimento) {
        super(id, nome, rg, dataNascimento);
    }

    private String cargo;
    private Double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
