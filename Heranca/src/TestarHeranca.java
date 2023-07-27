import java.util.Scanner;

public class TestarHeranca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int ano;
        String modelo, cor;

        System.out.println("Digite o ano do veiculo: ");
        ano = teclado.nextInt();

        System.out.println("Digite o modelo do veiculo: ");
        modelo = teclado.next();

        System.out.println("Digite a cor do veiculo: ");
        cor = teclado.next();

        Caminhonete caminhonete = new Caminhonete(ano, modelo, cor);
        Motocicleta motocicleta = new Motocicleta(ano, modelo, cor);

        System.out.println("Vamos calcular o IPVA, Seguro e Adicional da Caminhonete.");

        System.out.println("Digite  valor da Caminhonete: ");
        caminhonete.setValor(teclado.nextDouble());

        System.out.println("Digite o tamanho da Caminhonete: ");
        caminhonete.setTamanho(teclado.nextDouble());

        caminhonete.CalcularIpva();

        caminhonete.AdicionalVeiculo();

        caminhonete.Seguro();

        System.out.println("\nVamos calcular o IPVA, Seguro e da Motocicleta.");

        System.out.println("Digite o valor da motocicleta: ");
        motocicleta.setValor(teclado.nextDouble());

        motocicleta.CalcularIpva();

        motocicleta.Seguro();


    }



}
