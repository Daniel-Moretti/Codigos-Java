public class SocioPrata extends Socio{
    public SocioPrata(String nome, int idade, int numDependentes, Double valorPadraoTitulo) {
        super(nome, idade, numDependentes, valorPadraoTitulo);
        this.taxaPrata = 75.00;
    }

    private Double taxaPrata;

    public SocioPrata(String nome, int idade, int numDependentes, Double valorPadraoTitulo, Double taxaPrata) {
        super(nome, idade, numDependentes, valorPadraoTitulo);

    }

    public Double getTaxaPrata() {
        return taxaPrata;
    }

    public void setTaxaPrata(Double taxaPrata) {
        this.taxaPrata = taxaPrata;
    }

    public Double CalcularValorTitulo(){

        Double calculoTotalTitulo = getValorPadraoTitulo() + CalculoPrata();

        return calculoTotalTitulo;
    }

    private Double CalculoPrata(){

        Double valorTituloPrata = (50 * getnumDependentes()) + getTaxaPrata();

        return valorTituloPrata;

    }

}
