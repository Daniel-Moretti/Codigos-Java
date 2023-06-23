public class Moto extends Automovel{

    @Override
    public void acelerar() {
        double acelerar = super.getVelocidadeMedia() * 2;

        System.out.println("A moto " + super.getMarca() + " nome " + super.getNome() + " acelerou " + acelerar + "Km/h.");

    }
}
