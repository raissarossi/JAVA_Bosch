package bosch;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Computador";
        p1.preco = 5000;
        p1.desconto = 0.10;
        Produto p4 = new Produto("TV", 4000,0.15);
        System.out.println(p4.nome);
        System.out.println(p4.retornaStringFormatada());



    }
}
