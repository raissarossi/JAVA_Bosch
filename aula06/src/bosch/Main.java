package bosch;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Iphone 14";
        p1.preco = 12000;
        p1.desconto = 0.10;
        System.out.println(p1.nome+'\n'+p1.preco+'\n'+p1.desconto+'\n'+p1.precoDesconto());

        Produto p2 = new Produto();
        p2.nome = "Shampoo";
        p2.preco = 18;
        p2.desconto = 0.25;
        System.out.println('\n'+p2.nome+'\n'+p2.preco+'\n'+p2.desconto+'\n'+p2.precoDesconto());

        System.out.println(p1.somar(2,3));
    }
}
