import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        /**********************************************
         *  Criando os objetos a partir da classe Carro *
         *********************************************/
            Carro carro1 = Viajar(new Carro(), 1);

            Carro carro2 = new Carro();
            carro2 = Viajar(new Carro(), 2);

            Carro carro3 = new Carro();
            carro3 = Viajar(new Carro(), 3);

        /*************************************
         *  Apresentar na tela os resultados *
         ************************************/
            ApresentarInformacoes(carro1);
            ApresentarInformacoes(carro2);
            ApresentarInformacoes(carro3);


    }

    /**************************************************************
     * Método para criar o objeto carro e fazer ele andar(viajar) *
     * @param carro                                               *
     * @param idCarro                                             *
     * @return                                                    *
     *************************************************************/
        public static Carro Viajar(Carro carro, int idCarro){
            Scanner teclado = new Scanner(System.in);

            carro.setIdCarro(idCarro);

            System.out.println("**********************************************************");
            System.out.println("Digite o modelo do carro " + idCarro);
            carro.setModelo(teclado.nextLine());

            System.out.println("Digite a marca do carro " + idCarro);
            carro.setMarca(teclado.nextLine());

            System.out.println("Digite a quilometragem inicial do carro " + idCarro);
            carro.setQuilometragem(teclado.nextInt());

            int i = 1;
            while (i < 5){
                System.out.println("Digite quanto o carro " + idCarro + " vai andar na volta " + i);
                carro.acelerar(teclado.nextInt());
                i++;
            }

            return carro;

        }

    /***********************************************
     * Método para apresentar informações do carro *
      *********************************************/
        public static void ApresentarInformacoes(Carro carro){
            System.out.println("******************************************************");
            System.out.println("Apresentando informações do carro " + carro.getIdCarro());
            System.out.println("Marca: " + carro.getMarca() + " Modelo: " + carro.getModelo() +
                    " Nova quilometragem: " + carro.getQuilometragem());
            System.out.println(
                    carro.getQuilometragem()<=1000 ? "Carro com manutenção em dia" :
                            (carro.getQuilometragem()>1000) && (carro.getQuilometragem()<=3000) ? "Fazer primeira revisão." :
                                (carro.getQuilometragem()>3000) && (carro.getQuilometragem()<=5000) ? "Fazer a segunda revisão.":
                                    "Pecisa trocar o óleo.");
            

        }


}
