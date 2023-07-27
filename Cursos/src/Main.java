import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Marketing> marketingList = new ArrayList<>();
        List<Direito> direitoList = new ArrayList<>();
        List<Sistemas> sistemasList = new ArrayList<>();

        Marketing alunosMarketing;
        Direito alunosDireito;
        Sistemas alunosSistemas;

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("""
                    \n#################################################
                    MENU CADASTRO ALUNO:
                    1- Marketing
                    2- Direito
                    3- Sistemas
                    4- Relatorios
                    5- Sair
                    #################################################\n""");
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                alunosMarketing = (Marketing) CadastrarAluno(marketingList.size()+1, opcao);
                marketingList.add(alunosMarketing);

            } else if (opcao == 2) {
                alunosDireito = (Direito) CadastrarAluno(direitoList.size()+1, opcao);
                direitoList.add(alunosDireito);

            } else if (opcao == 3) {
                alunosSistemas = (Sistemas) CadastrarAluno(sistemasList.size()+1, opcao);
                sistemasList.add(alunosSistemas);

            } else if (opcao == 4) {
                int opcaoRelatorio = 0;

                while (opcaoRelatorio != 4) {
                    System.out.println("""
                            \n#################################################
                            ESCOLHA O CURSO PARA OBTER O RELATÓRIO DE ALUNOS:
                            1- Marketing
                            2- Direito
                            3- Sistemas
                            4- Voltar ao menu anterior
                            #################################################\n""");
                    System.out.print("Digite a opção desejada: ");
                    opcaoRelatorio = teclado.nextInt();

                    if (opcaoRelatorio == 1) {
                        RelatorioAlunosMarketing(marketingList);

                    } else if (opcaoRelatorio == 2) {
                        RelatorioAlunosDireito(direitoList);

                    } else if (opcaoRelatorio == 3) {
                        RelatorioAlunosSistemas(sistemasList);

                    } else if (opcaoRelatorio == 4) {
                        break;

                    } else {
                        System.out.println("Opção incorreta. Tente novamente\n\n");
                    }

                }
            } else if (opcao == 5) {
                break;

            } else {
                System.out.println("Opção incorreta. Tente novamente\n\n");
            }


        }
    }

    public static Cursos CadastrarAluno (int codAluno, int opcao) {
        Scanner teclado = new Scanner(System.in);

        if (opcao == 1) {
            Marketing marketing = new Marketing();
            marketing.setCodigo(codAluno);
            marketing.setNomeCurso("Marketing");

            System.out.print("Nome do aluno: ");
            marketing.setNomeAluno(teclado.nextLine());

            System.out.print("Valor Padrão do curso: ");
            marketing.setValorPadraoCurso(teclado.nextDouble());


            return marketing;

        } else if (opcao == 2) {
            Direito direito = new Direito();
            direito.setCodigo(codAluno);
            direito.setNomeCurso("Direito");

            System.out.print("Nome do aluno: ");
            direito.setNomeAluno(teclado.nextLine());

            System.out.print("Valor Padrão do curso: ");
            direito.setValorPadraoCurso(teclado.nextDouble());

            return direito;

        } else if (opcao == 3) {
            Sistemas sistemas = new Sistemas();
            sistemas.setCodigo(codAluno);
            sistemas.setNomeCurso("Sistemas");

            System.out.print("Nome do aluno: ");
            sistemas.setNomeAluno(teclado.nextLine());

            System.out.print("Valor Padrão do curso: ");
            sistemas.setValorPadraoCurso(teclado.nextDouble());

            return sistemas;
        }

        return null;
    }

    public static void RelatorioAlunosMarketing(List<Marketing> marketingList) {

        Marketing alunosMarketing;
        int i = 0;

        while (marketingList.size() > i) {
            alunosMarketing = marketingList.get(i);
            double vlrCursoMarketing = alunosMarketing.CalcularMensalidade();
            System.out.println("\n************************************");
            System.out.println("Codigo aluno: " + alunosMarketing.getCodigo());
            System.out.println("Nome do aluno: " + alunosMarketing.getNomeAluno());
            System.out.println("Curso: " + alunosMarketing.getNomeCurso());
            System.out.printf("Valor do curso recalculado %.2f", vlrCursoMarketing);
            System.out.println("\n************************************\n\n");
            i++;
        }
    }

    public static void RelatorioAlunosDireito(List<Direito> direitoList) {

        Direito alunosDireito;
        int i = 0;

        while (direitoList.size() > i) {
            alunosDireito = direitoList.get(i);
            double vlrCursoDireito = alunosDireito.CalcularMensalidade();
            System.out.println("\n************************************");
            System.out.println("Codigo aluno: " + alunosDireito.getCodigo());
            System.out.println("Nome do aluno: " + alunosDireito.getNomeAluno());
            System.out.println("Curso: "+ alunosDireito.getNomeCurso());
            System.out.printf("Valor do curso recalculado %.2f", vlrCursoDireito);
            System.out.println("\n************************************\n\n");
            i++;
        }

    }

    public static void RelatorioAlunosSistemas(List<Sistemas> sistemasList) {

        Sistemas alunosSistemas;
        int i = 0;

        while (sistemasList.size() > i) {
            alunosSistemas = sistemasList.get(i);
            double vlrCursoSistemas = alunosSistemas.CalcularMensalidade();
            System.out.println("\n************************************");
            System.out.println("Codigo aluno: " + alunosSistemas.getCodigo());
            System.out.println("Nome do aluno: " + alunosSistemas.getNomeAluno());
            System.out.println("Curso: "+ alunosSistemas.getNomeCurso());
            System.out.printf("Valor do curso recalculado %.2f", vlrCursoSistemas);
            System.out.println("\n************************************\n\n");
            i++;
        }

    }



}
