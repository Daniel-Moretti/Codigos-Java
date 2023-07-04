import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Digite o número de Dependentes: ");
        int numDependentes = teclado.nextInt();

        System.out.print("Valor padrão do título: ");
        Double valorPadraoTitulo = teclado.nextDouble();

        int opcao = 0;

        System.out.println("""
            ESCOLHA A CLASSE DO SÓCIO:
            1- Ouro.
            2- Prata.
            3- Bronze.""");
        System.out.print("Digite a opção desejada: ");
        opcao = teclado.nextInt();

        switch (opcao){
            case 1 :
                SocioOuro socioOuro = new SocioOuro(nome, idade, numDependentes, valorPadraoTitulo);
                Double valorTituloOuro = socioOuro.CalcularValorTitulo();

                System.out.println("RESULTADO:");
                System.out.print("Nome: " + socioOuro.getNome());
                System.out.print("\nIdade: " + socioOuro.getIdade());
                System.out.print("\nNúmero de dependentes: " + socioOuro.getnumDependentes());
                System.out.print("\nValor do título para classe Ouro: R$ " + valorTituloOuro);

                break;

            case 2 :
                SocioPrata socioPrata = new SocioPrata(nome, idade, numDependentes, valorPadraoTitulo);
                Double valorTituloPrata = socioPrata.CalcularValorTitulo();

                System.out.println("RESULTADO:");
                System.out.print("Nome: " + socioPrata.getNome());
                System.out.print("\nIdade: " + socioPrata.getIdade());
                System.out.print("\nNúmero de dependentes: " + socioPrata.getnumDependentes());
                System.out.print("\nValor do título para classe Ouro: R$ " + valorTituloPrata);

                break;

            case 3 :
                SocioBronze socioBronze = new SocioBronze(nome, idade, numDependentes, valorPadraoTitulo);
                Double valorTituloBronze = socioBronze.CalcularValorTitulo();

                System.out.println("RESULTADO:");
                System.out.print("Nome: " + socioBronze.getNome());
                System.out.print("\nIdade: " + socioBronze.getIdade());
                System.out.print("\nNúmero de dependentes: " + socioBronze.getnumDependentes());
                System.out.print("\nValor do título para classe Ouro: R$ " + valorTituloBronze);

                break;

            default :
                System.out.println("Opção inválida.");

                break;

            }

        }



}
