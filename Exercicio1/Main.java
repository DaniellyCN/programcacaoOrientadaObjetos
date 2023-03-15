package Exercicio1;

public class Main {
    public static void main(String[] args){
        Produto r1 = new Revista(1785,"O Pequeno Príncipe", 62.90, "Editora Nova");
        Revista r2 = new Revista(9424,"A Culpa é das Estrelas", 28.60, "Editora Inovadora");
        r1.setValor(10.00);
        r2.setNome("Info Exame");
        r2.setEditora("Globo");
    
    //tentar ao maximo referenciar a superclasse

        Produto livro = new Livro(5327, "O Idiota", 89.88, "Descartes", "Editoria Filo");
        Produto dvd = new Dvd(76238, "Risos de Alice", 78.99, "Donald Mcholn", "rock");
        Produto revista = new Revista(4563,"Caras", 12.50, "Editora Edith");


        ListaProdutos listaDeProdutos = new ListaProdutos();
        listaDeProdutos.incluirProduto(livro);
        listaDeProdutos.incluirProduto(dvd);
        listaDeProdutos.incluirProduto(revista);


        System.out.println(listaDeProdutos.Listar());

    }
}
