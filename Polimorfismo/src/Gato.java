public class Gato extends SerVivo{
    @Override
    public void falar() {
        System.out.println("O gato mia! Seu nome é: " + super.getNome() + " idade: " + super.getIdade());

    }
}
