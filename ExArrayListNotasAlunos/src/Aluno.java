public class Aluno {
    private int codigo, cont;
    private String nome, notas;
    private float media, somaNota;

    public Aluno(){
        this.cont = 0;
        this.somaNota = 0;
        this.notas = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        if (cont == 1){
            this.notas += notas;
        } else {
            this.notas += " - " + notas;
        }
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float nota) {
        this.media = CalculaMedia(nota);
    }

    public float CalculaMedia(float nota) {
        float media;
        cont += 1;
        somaNota += nota;
        media = somaNota / cont;

        return media;
    }


}

