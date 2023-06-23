public class Caminhao extends Automovel{
    @Override
    public void acelerar() {
        double acelerar = (super.getVelocidadeMedia() * 2) + 3;
        System.out.println("O caminhão " + super.getMarca() + " nome " + super.getNome() + " acelerou " + acelerar + "Km/h.");
    }
}
