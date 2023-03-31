//Faça um programa que percorra todos os números de 1 até 100.
// Para os números ímpares, deve ser impresso um “*”,
// e para os números pares, deve ser impresso dois “**”.
public class EX02 {
    public static void main(String[] args) {
        for (int cont = 1; cont<101; cont++){
            if (cont%2 != 0){
                System.out.printf(cont + " - *\n");


            }else{
                System.out.printf(cont + " - **\n");

            }
        }


    }

}
