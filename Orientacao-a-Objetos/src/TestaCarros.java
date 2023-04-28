import java.util.Scanner;

public class TestaCarros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carros carro1 = new Carros();
        Carros carro2 = new Carros();
        Carros carro3 = new Carros();
        Carros carro4 = new Carros();

        int ano;
        String cor, modelo;
        double valor;

        for (int i=1; i<=4; i++) {
            System.out.println("Digite o ano do carro: ");
            ano = teclado.nextInt();

            System.out.println("Digite a cor do carro: ");
            cor = teclado.next();

            System.out.println("Digite o modelo do carro: ");
            modelo = teclado.next();

            System.out.println("Digite o valor do carro: ");
            valor = teclado.nextDouble();

            if (i==1) {
                carro1.setAno(ano);
                carro1.setCor(cor);
                carro1.setModelo(modelo);
                carro1.setValor(valor);
            } else if (i==2) {
                carro2.setAno(ano);
                carro2.setCor(cor);
                carro2.setModelo(modelo);
                carro2.setValor(valor);
            } else if (i==3) {
                carro3.setAno(ano);
                carro3.setCor(cor);
                carro3.setModelo(modelo);
                carro3.setValor(valor);
            } else {
                carro4.setAno(ano);
                carro4.setCor(cor);
                carro4.setModelo(modelo);
                carro4.setValor(valor);
            }
        }


        System.out.println("Ano do carro 1: "+ carro1.getAno());
        System.out.println("Cor do carro 1: "+ carro1.getCor());
        System.out.println("Modelo do carro 1: "+ carro1.getModelo());
        System.out.println("Valor do carro 1: "+ carro1.getValor());

        System.out.println("");

        System.out.println("Ano do carro 2: "+ carro2.getAno());
        System.out.println("Cor do carro 2: "+ carro2.getCor());
        System.out.println("Modelo do carro 2: "+ carro2.getModelo());
        System.out.println("Valor do carro 2: "+ carro2.getValor());

        System.out.println("");

        System.out.println("Ano do carro 3: "+ carro3.getAno());
        System.out.println("Cor do carro 3: "+ carro3.getCor());
        System.out.println("Modelo do carro 3: "+ carro3.getModelo());
        System.out.println("Valor do carro 3: "+ carro3.getValor());

        System.out.println("");

        System.out.println("Ano do carro 4: "+ carro4.getAno());
        System.out.println("Cor do carro 4: "+ carro4.getCor());
        System.out.println("Modelo do carro 4: "+ carro4.getModelo());
        System.out.println("Valor do carro 4: "+ carro4.getValor());

    }


}
