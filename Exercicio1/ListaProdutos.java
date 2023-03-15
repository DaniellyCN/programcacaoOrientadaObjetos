package Exercicio1;
import java.util.ArrayList;
import java.util.List;

public class ListaProdutos implements IListaProdutos {
    List<Produto> listaProdutos;

    public ListaProdutos(){
        listaProdutos = new ArrayList<>();
    }

    public void incluirProduto(Produto produto){
        listaProdutos.add(produto);
    }
    
    public Produto consultarProduto(int codigo){
        for(Produto produto : listaProdutos){
            if(produto.getCodigo()==codigo){
                return produto;
            }
        }
        // fazer tratamento de retorno para aqui
        return null;
    }
    public boolean removerProduto(int codigo){
        for(Produto produto : listaProdutos){
            if(produto.getCodigo()==codigo){
                return true;
            }
        }
        return false;
    }

    public String Listar(){
        String dados = "";
        for(Produto produto : listaProdutos){
            dados+=produto.toString();
        }
        return dados;
    }
}
