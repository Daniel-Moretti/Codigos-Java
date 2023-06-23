import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Moto moto = new Moto();
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        System.out.println("######Dados da moto######");
        System.out.println("Digite a marca: ");
        moto.setMarca(teclado.nextLine());

        System.out.println("Digite o nome: ");
        moto.setNome(teclado.nextLine());

        System.out.println("Digite a velocidade média: ");
        moto.setVelocidadeMedia(teclado.nextDouble());

        teclado.nextLine(); //Limpar buffer do teclado após entrada numérica.

        System.out.println("######Dados do carro######");
        System.out.println("Digite a marca: ");
        carro.setMarca(teclado.nextLine());

        System.out.println("Digite o nome: ");
        carro.setNome(teclado.nextLine());

        System.out.println("Digite a velocidade média: ");
        carro.setVelocidadeMedia(teclado.nextDouble());

        teclado.nextLine(); //Limpar buffer do teclado após entrada numérica.

        System.out.println("######Dados do caminhão######");
        System.out.println("Digite a marca: ");
        caminhao.setMarca(teclado.nextLine());

        System.out.println("Digite o nome: ");
        caminhao.setNome(teclado.nextLine());

        System.out.println("Digite a velocidade média: ");
        caminhao.setVelocidadeMedia(teclado.nextDouble());

        moto.acelerar();
        carro.acelerar();
        caminhao.acelerar();

    }


}
