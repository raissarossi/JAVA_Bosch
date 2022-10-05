package bosch;

public class Produto {

    String nome;
    double preco;
    double desconto;
    double precoDesconto(){
        return preco-(preco*desconto);
    }

    int somar(int par1, int par2){
        return par1+par2;
    }
}
