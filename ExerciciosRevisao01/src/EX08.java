//Crie uma Classe que receba o nome,  estado civil  e o sexo de uma pessoa.
// Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).

import java.util.Scanner;


public class EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, estadoCivil, sexo;
        int tempoCasado=0;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("\nDigite seu estado civil: ");
        estadoCivil = teclado.nextLine();
        System.out.print("\nDigite seu sexo [F ou M]: ");
        sexo = teclado.nextLine().toUpperCase();

        System.out.println(sexo);

        if (sexo.equals("F")) {
            System.out.print("\nDigite o tempo de casado em anos: ");
            tempoCasado = teclado.nextInt();
        }

        System.out.println("Nome: "+ nome);
        System.out.println("Estado civil: "+ estadoCivil);
        System.out.println("sexo: "+ sexo);
        System.out.println("Tempo de casado: "+ tempoCasado);


    }


}
