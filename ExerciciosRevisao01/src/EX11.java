//Crie uma classe que calcule o IMC de uma pessoa e mostre de acordo com a tabela a
// condição física da pessoa:
//
//IMC em adultos Condição
//Abaixo de 18,5 Abaixo do peso
//Entre 18,5 e 25 Peso normal
// Entre 25 e 30 Acima do peso
//Acima de 30 obeso

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double imc, peso, altura;

        System.out.print("Cálculo de IMC");
        System.out.print("\nDigite seu peso em KG: ");
        peso = teclado.nextFloat();

        System.out.print("\nDigite sua altura em metros: ");
        altura = teclado.nextFloat();

        imc = peso / (altura*altura);

        if (imc<18.5){
            System.out.println("Voce está abaixo do peso.");
        } else if (imc>=18.5 && imc<=25) {
            System.out.println("Voce está no peso normal.");
        } else if (imc>25 && imc<=30) {
            System.out.println("Voce está acima do peso.");
        } else if (imc>30) {
            System.out.println("Voce está obeso.");
        }



    }


}
