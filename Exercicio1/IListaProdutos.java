package Exercicio1;
public interface IListaProdutos {

    // não é necessário colocar public e abstract porque por default todos os métodos 
    // de uma interface são publicos e abstratos

    public abstract void incluirProduto(Produto produto);
    public abstract Produto consultarProduto(int codigo);
    public abstract boolean removerProduto(int codigo);
    

}
