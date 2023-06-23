public class Circulo extends Figura{

    private Double raio;
    private Double PI = 3.14;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public void area() {
        Double areaCirculo = this.PI * (this.raio * this.raio);
        System.out.println("A área do círculo é: " + areaCirculo + "m².");
    }
}
