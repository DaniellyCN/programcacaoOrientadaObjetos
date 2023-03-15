package Exercicio1;
public class Livro extends Produto {
    private String autor;
    private String editora;

    public Livro(int codigo, String nome, double valor, String autor, String editora){
        super(codigo,nome,valor);
        this.autor = autor;
        this.editora = editora;
    }

    public String getAutor(){
        return autor;
    }

    public String getEditora(){
        return editora;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }
}
