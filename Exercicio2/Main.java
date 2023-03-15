package Exercicio2;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Tecnico("David",6547);
        System.out.println(p1.getNome());
        

        Professor p2 = new Professor("Adalberto", "ES");
        System.out.println(p2.getSiape());
    }
}
