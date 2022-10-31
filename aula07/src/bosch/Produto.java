package bosch;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(){}
//    Produto(String nome){
//        System.out.println("Executando construtor 1");
//    }
//    Produto(String nome, double preco){
//        System.out.println("Executando construtor 2");
//    }
    Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    void PrecoComDesconto(double descontoAdicioal){
        System.out.println(preco-(preco*(desconto+descontoAdicioal)));
    }

    String retornaStringFormatada(){
        return String.format("O produto s% está saindo por s% e com o desconta está s%",this.nome, this.preco, this.desconto);
    }

}
