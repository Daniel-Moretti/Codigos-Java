import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();
        Livro livro4 = new Livro();
        Livro livro5 = new Livro();
        Livro livro6 = new Livro();



        opcao = 0;

        while (opcao!=4) {
            System.out.println("""
                MENU:
                1- Cadastrar Livros
                2- Emprestar Livro
                3- Relatorio Livros
                4- Sair""");
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    livro1 = PopularBiblioteca(new Livro(), 1);
                    livro2 = PopularBiblioteca(new Livro(), 2);
                    livro3 = PopularBiblioteca(new Livro(), 3);
                    livro4 = PopularBiblioteca(new Livro(), 4);
                    livro5 = PopularBiblioteca(new Livro(), 5);
                    livro6 = PopularBiblioteca(new Livro(), 6);
                    break;
                case 2:
                    int opcao2 = -1;
                    while (opcao2 == -1) {
                        System.out.println("Código ### Título ### Status ### Qtde. de empréstimos");
                        ApresentarBiblioteca(livro1);
                        ApresentarBiblioteca(livro2);
                        ApresentarBiblioteca(livro3);
                        ApresentarBiblioteca(livro4);
                        ApresentarBiblioteca(livro5);
                        ApresentarBiblioteca(livro6);


                        System.out.print("Digite o código do livro que você quer emprestar ou 0 (zero) para voltar ao menu anterior: ");
                        opcao2 = teclado.nextInt();
                        switch (opcao2){
                            case 1:
                                EmprestarLivro(livro1);
                                break;
                            case 2:
                                EmprestarLivro(livro2);
                                break;
                            case 3:
                                EmprestarLivro(livro3);
                                break;
                            case 4:
                                EmprestarLivro(livro4);
                                break;
                            case 5:
                                EmprestarLivro(livro5);
                                break;
                            case 6:
                                EmprestarLivro(livro6);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcao incorreta. Tente novamente.");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Código ### Título ### Status ### Qtde. de empréstimos");
                    ApresentarBiblioteca(livro1);
                    ApresentarBiblioteca(livro2);
                    ApresentarBiblioteca(livro3);
                    ApresentarBiblioteca(livro4);
                    ApresentarBiblioteca(livro5);
                    ApresentarBiblioteca(livro6);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção não encontrada. Tente novamente");
                    System.out.print("Digite a opção desejada: ");
                    opcao = teclado.nextInt();

            }
        }


        System.out.println("Fim do programa.");

    }

    public static Livro PopularBiblioteca(Livro livro, int codigo){
        Scanner teclado = new Scanner(System.in);

        livro.setCodigo(codigo);

        System.out.println("Digite o nome do livro " + codigo + ": ");
        livro.setTitulo(teclado.nextLine());

        return livro;
    }

    public static void ApresentarBiblioteca(Livro livro) {
        System.out.println(livro.getCodigo() + " \t" + livro.getTitulo() + "\t" + livro.getStatus() + " \t" + livro.getQuantEmprestimos());
    }

    public static void EmprestarLivro(Livro livro) {
        livro.setQuantEmprestimos(1);
        livro.setStatus("Emprestado");

    }


}
