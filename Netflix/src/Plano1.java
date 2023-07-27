public class Plano1 extends Plano{



    @Override
    public double CalcularMensalidade() {

        double mensPlano1 = super.getVlrPadrao() + ((super.getVlrPadrao() * 5)/100);

        return mensPlano1;
    }
}
