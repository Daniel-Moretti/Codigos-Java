public class SocioBronze extends Socio{
    public SocioBronze(String nome, int idade, int numDependentes, Double valorPadraoTitulo) {
        super(nome, idade, numDependentes, valorPadraoTitulo);
        this.taxaBronze = 55.00;
    }

    private Double taxaBronze;

    public Double getTaxaBronze() {
        return taxaBronze;
    }

    public void setTaxaBronze(Double taxaBronze) {
        this.taxaBronze = taxaBronze;
    }

    public Double CalcularValorTitulo(){

        Double calculoTotalTitulo = getValorPadraoTitulo() + CalculoBronze();

        return calculoTotalTitulo;
    }

    private Double CalculoBronze(){

        Double valorTituloBronze = (25 * getnumDependentes()) + getTaxaBronze();

        return valorTituloBronze;

    }
}
