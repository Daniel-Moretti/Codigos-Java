public class Quadrado extends Figura{

    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public void area() {
        Double areaQuadrado = this.lado * this.lado;

        System.out.println("A área do quadrado é: " + areaQuadrado + "m².");
    }
}
