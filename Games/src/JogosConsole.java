public class JogosConsole extends Jogos{
    public JogosConsole(int cod, String nome, Double valor) {
        super(cod, nome, valor);
    }

    private String marca, modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
