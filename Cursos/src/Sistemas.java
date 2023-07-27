public class Sistemas extends Cursos{

    @Override
    public double CalcularMensalidade() {
        double taxa = super.getValorPadraoCurso() * ((double) 5 /100);
        return (super.getValorPadraoCurso() * 2) + taxa;
    }

}
