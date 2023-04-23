//Faça uma classe que receba 10 alunos e 10 notas finais dos aluno calcule a média e
// imprima na tela o Nome a Nota e:
//Se a nota for menor que 6 "Reprovado"
//Entre 6 e 7 "Em Recuperação".
//Entre acima de 7 "Aprovado".


import java.util.ArrayList;
import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String aluno;
        float notaFinal, num, soma=0, media;
        int cont=1, s, i;

        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<Float> notas = new ArrayList<>();

        while (cont<4){
            System.out.print("Digite o nome do aluno: ");
            aluno = teclado.next();

            System.out.print("Digite a nota final do aluno: ");
            notaFinal = teclado.nextFloat();

            alunos.add(aluno);
            notas.add(notaFinal);
            cont++;
        }
        s= notas.size();

        for (i=0; i<s; i++) {
            num = notas.get(i);
            soma += num;
        }

        media = soma/s;

        System.out.println(" ");

        for (i=0; i<s; i++) {

            if (notas.get(i)<6){
                System.out.println("Aluno: "+alunos.get(i)+" - Nota: "+notas.get(i)+ " - Reprovado");
            } else if (notas.get(i)>=6 && notas.get(i)<=7) {
                System.out.println("Aluno: "+alunos.get(i)+" - Nota: "+notas.get(i)+ " - Em Recuperação");
            } else {
                System.out.println("Aluno: "+alunos.get(i)+" - Nota: "+notas.get(i)+ " - Aprovado");
            }
        }

        System.out.println("\nA media das notas finais dos alunos é: "+media);



    }

}
