public class Plano2 extends Plano{

    @Override
    public double CalcularMensalidade() {

        return super.getVlrPadrao() + ((super.getVlrPadrao() * 15)/100);

    }
}
