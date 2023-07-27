public class Marketing extends Cursos{


    @Override
    public double CalcularMensalidade() {
        return super.getValorPadraoCurso() * 1.5;

    }
}
