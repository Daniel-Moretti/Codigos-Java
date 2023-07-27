public class Direito extends Cursos{


    @Override
    public double CalcularMensalidade() {
        return super.getValorPadraoCurso() * 2;
    }
}
