public class ProdutoIndustria extends Produtos{

    public ProdutoIndustria(int codigo, String descricao, Double valor) {
        super(codigo, descricao, valor);
    }

    private Double percentualIpi;

    public Double getPercentualIpi() {
        return percentualIpi;
    }

    public void setPercentualIpi(Double percentualIpi) {
        this.percentualIpi = percentualIpi;
    }

    public Double ValorProdComIpi(){
        Double valorIpi = getValor() * (getPercentualIpi() / 100);

        return getValor() + valorIpi;

    }
}
