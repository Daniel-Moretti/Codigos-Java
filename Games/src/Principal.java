import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        Double valor;

        System.out.println("********** Cadastrar jogos de console ************");

        System.out.println("Informe o nome do jogo: ");
        nome = teclado.nextLine();

        System.out.println("Informe o valor do jogo: ");
        valor = teclado.nextDouble();

        JogosConsole jogosConsole = new JogosConsole(1, nome, valor);

        teclado.nextLine();

        System.out.println("Informe a marca do console: ");
        jogosConsole.setMarca(teclado.nextLine());

        System.out.println("Informe o modelo do console: ");
        jogosConsole.setModelo(teclado.nextLine());

        System.out.println("********** Cadastrar jogos de PC **********");

        System.out.println("Informe o nome do jogo: ");
        nome = teclado.nextLine();

        System.out.println("Informe o valor do jogo: ");
        valor = teclado.nextDouble();

        JogosPc jogosPc = new JogosPc(1, nome, valor);

        teclado.nextLine();


        System.out.println("Informe o processador do PC: ");
        jogosPc.setProcessador(teclado.nextLine());

        System.out.println("Informe o modelo de placa de video: ");
        jogosPc.setPlacaDeVideo(teclado.nextLine());

        System.out.println("************************************************************");

        System.out.println("Informações dos jogos console");
        System.out.println("Código: " + jogosConsole.getCod() + "\nNome do jogo: " + jogosConsole.getNome());
        System.out.println("Valor do jogo: " + jogosConsole.getValor());
        System.out.println("Marca do console: " + jogosConsole.getMarca() + "\nModelo do console: " + jogosConsole.getModelo());

        System.out.println("************************************************************");

        System.out.println("Informações dos jogos para PC");
        System.out.println("Código: " + jogosPc.getCod() + "\nNome do jogo: " + jogosPc.getNome());
        System.out.println("Valor do jogo: " + jogosPc.getValor());
        System.out.println("Processador: " + jogosPc.getProcessador() + "\nPlaca de Video: " + jogosPc.getPlacaDeVideo());

        System.out.println("************************************************************");

    }
}
