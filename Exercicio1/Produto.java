package Exercicio1;
public abstract class Produto{

    private int codigo;
    private String nome;
    private double valor;

    public Produto(int codigo, String nome, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getValor(){
        return valor;
    }
    //nao devo ter @setCodigo
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public String toString(){
        return "Código: "+codigo+" Nome: "+nome+" Valor: "+valor+"\n";
    }

}