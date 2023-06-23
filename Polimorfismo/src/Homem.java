public class Homem extends SerVivo{

    @Override
    public void falar() {
        System.out.println("O Homem fala! Seu nome é: " + super.getNome() + " idade: " + super.getIdade());

    }

}
