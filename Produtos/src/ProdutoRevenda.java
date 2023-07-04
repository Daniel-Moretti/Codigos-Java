public class ProdutoRevenda extends Produtos{
    public ProdutoRevenda(int codigo, String descricao, Double valor) {
        super(codigo, descricao, valor);
    }

    private Double percentualIcms;

    public Double getPercentualIcms() {
        return percentualIcms;
    }

    public void setPercentualIcms(Double percentualIcms) {
        this.percentualIcms = percentualIcms;
    }

    public Double ValorProdComIcms(){
        Double valorIcms = getValor() * (getPercentualIcms() /100);

        return getValor() + valorIcms;
    }


}
