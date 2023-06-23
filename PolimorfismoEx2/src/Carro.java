public class Carro extends Automovel{
    @Override
    public void acelerar() {
        double acelerar = (super.getVelocidadeMedia() * 2) + 10;
        System.out.println("O carro " + super.getMarca() + " nome " + super.getNome() + " acelerou " + acelerar + "Km/h.");
    }
}
