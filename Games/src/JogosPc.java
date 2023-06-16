public class JogosPc extends Jogos{

    public JogosPc(int cod, String nome, Double valor){
        super(cod, nome, valor);
    }

    private String processador, placaDeVideo;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
}
