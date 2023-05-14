public class Carro {
    /***********************************
     * Declaração de atributos privados*
     **********************************/
        private int idCarro;
        private String modelo;
        private String marca;
        private Integer quilometragem;

    /****************************************************************
     * Declaração dos métodos públicos de encapsulamento (get e set)*
     ***************************************************************/
        public int getIdCarro(){
            return idCarro;
        }

        public void setIdCarro(int idCarro){
            this.idCarro = idCarro;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getMarca() {
            return marca;
        }

        public Integer getQuilometragem() {
            return quilometragem;
        }

        public void setQuilometragem(Integer quilometragem) {
            this.quilometragem = quilometragem;
        }

    /******************************************************
     * Declaração dos métodos públicos restantes da classe*
     *****************************************************/
        public void acelerar(Integer quilometragem){
            this.quilometragem += quilometragem;
        }

}
