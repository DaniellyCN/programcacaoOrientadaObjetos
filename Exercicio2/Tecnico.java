package Exercicio2;

public class Tecnico extends Pessoa implements Aposentadoria {
    private int SIAPE;

    public Tecnico(String nome, int siape){
        super(nome);
        this.SIAPE = siape;
    }

    public int calculaTempoMinimo(){return 30;};
    public int getSiape(){return SIAPE;}
}
