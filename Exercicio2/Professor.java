package Exercicio2;

public class Professor extends Pessoa implements Aposentadoria {
    private static int siapeGeral = 234;
    private String curso;

    public Professor(String nome,String curso){
        super(nome);
        this.curso = curso;
    }

    public int calculaTempoMinimo(){return 20;}
    public int getSiape(){return siapeGeral;}
    public String getCurso(){return curso;}
}
