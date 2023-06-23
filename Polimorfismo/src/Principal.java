import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SerVivo serVivo1 = new Homem();
        System.out.println("Informe o nome do Homem: ");
        serVivo1.setNome(teclado.next());

        System.out.println("Informe a idade do homem: ");
        serVivo1.setIdade(teclado.nextInt());

        SerVivo serVivo2 = new Cachorro();
        System.out.println("Informe o nome do Cachorro: ");
        serVivo2.setNome(teclado.next());

        System.out.println("Informe a idade do cachorro: ");
        serVivo2.setIdade(teclado.nextInt());

        SerVivo serVivo3 = new Gato();
        System.out.println("Informe o nome do Gato: ");
        serVivo3.setNome(teclado.next());

        System.out.println("Informe a idade do gato: ");
        serVivo3.setIdade(teclado.nextInt());

        //System.out.println("Homem: " + serVivo1.getNome() + " idade: " + serVivo1.getIdade());
        serVivo1.falar();

        //System.out.println("Cachorro: " + serVivo2.getNome() + " idade: " + serVivo2.getIdade());
        serVivo2.falar();

        //System.out.println("Gato: " + serVivo3.getNome() + " idade: " + serVivo3.getIdade());
        serVivo3.falar();

    }
}
