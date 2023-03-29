/*5 - Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou
V-vespertino ou N-noturno. Imprima a mensagem “Bom dia!” ou  “Boa Noite” ou “Valor inválido”,
conforme o caso.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        String turno;

        Scanner teclado = new Scanner(System.in);


        System.out.println("\nEm que turno você estuda? [Escolha uma opção]");
        System.out.println(
                    """
                            M- Matutino
                            V- Vespertino
                            N- Noturno
                            """
        );
        System.out.print("Digite a opção desejada: ");
        turno = teclado.next();



        if (turno.equals("M")) {
            System.out.println("Bom dia!!");
        } else if (turno.equals("V")) {
            System.out.println("Boa Tarde!!");
        } else if (turno.equals("N")) {
            System.out.println("Boa Noite!!");
        } else{
            System.out.print("Valor Inválido.");
        }

    }

}
