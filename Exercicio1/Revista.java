package Exercicio1;
public class Revista extends Produto {
    private String editora;

    public Revista(int codigo, String nome, double valor, String editora){
        super(codigo,nome,valor);
        this.editora = editora;
    }

    public String getEditora(){
        return editora;
    }

    public void setEditora(String e){
        this.editora = e;
    }
}
