package Exercicio1;
public class Dvd extends Produto{
    private String autor;
    private String estilo;

    public Dvd(int codigo, String nome, double valor, String autor, String estilo){
        super(codigo,nome,valor);
        this.autor = autor;
        this.estilo = estilo;
    }

    public String getAutor(){
        return autor;
    }

    public String getEstilo(){
        return estilo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setEstilo(String estilo){
        this.estilo = estilo;
    }
}
