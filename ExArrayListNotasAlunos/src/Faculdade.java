import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Aluno> listAlunos = new ArrayList<>();
        Aluno aluno;

        int opcao;
        boolean sair = false;

        while (sair == false) {
            System.out.println("""
                    #################################################################
                    1- Cadastrar alunos e notas.
                    2- Relatorio alunos e médias.
                    3- Sair.
                    #################################################################""");
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1 -> {
                    aluno = LancamentoNotas(listAlunos.size() + 1);
                    listAlunos.add(aluno);
                }
                case 2 -> RelatorioNotas(listAlunos);
                case 3 -> sair = true;
            }
        }




    }

    public static Aluno LancamentoNotas(int codigo){
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();
        aluno.setCodigo(codigo);

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(teclado.nextLine());

        boolean continuarDigitando = true;

        for (int i = 1; continuarDigitando; i++){
            System.out.printf("\nDigite a %dª nota de %s: ", i, aluno.getNome());
            float nota = teclado.nextFloat();
            aluno.setMedia(nota);
            String strNota = Float.toString(nota);
            aluno.setNotas(strNota);

            System.out.printf("\nA média do aluno '" + aluno.getNome() + "' é %.2f", aluno.getMedia());
            System.out.println("\nAs notas digitadas foram: "+ aluno.getNotas());

            boolean continuar = true;
            while (continuar) {
                System.out.print("\nDeseja digitar mais nota? [S/N]");
                String opcao = teclado.next();
                if (opcao.equals("S") || opcao.equals("s")){
                    continuar = false;
                } else if (opcao.equals("N") || opcao.equals("n")) {
                    continuar = false;
                    continuarDigitando = false;
                } else {
                    System.out.println("Opção incorreta.");
                }
            }

        }

        return aluno;
    }

    public static void RelatorioNotas(List<Aluno> listAlunos){
        Aluno aluno;
        int i = 0;

        while (listAlunos.size() > i) {
            aluno = listAlunos.get(i);
            System.out.println("************************************");
            System.out.println("Nome do aluno: " + aluno.getNome());
            System.out.println("As notas digitadas foram: "+ aluno.getNotas());
            System.out.printf("Média Final: %.2f", aluno.getMedia());
            System.out.println("\n************************************\n");
            i++;
        }

    }


}
