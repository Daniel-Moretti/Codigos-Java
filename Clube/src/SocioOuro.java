public class SocioOuro extends Socio{

    public SocioOuro(String nome, int idade, int numDependentes, Double valorPadraoTitulo) {
        super(nome, idade, numDependentes, valorPadraoTitulo);
        this.taxaOuro = 100.00;
    }

    private Double taxaOuro;

    public Double getTaxaOuro() {
        return taxaOuro;
    }

    public void setTaxaOuro(Double taxaOuro) {
        this.taxaOuro = taxaOuro;
    }


    public Double CalcularValorTitulo(){

        Double calculoTotalTitulo = getValorPadraoTitulo() + CalculoOuro();

        return calculoTotalTitulo;
    }

    private Double CalculoOuro(){

        Double valorTituloOuro = (Double) (100.00 * getnumDependentes()) + getTaxaOuro();

        return valorTituloOuro;

    }


}
