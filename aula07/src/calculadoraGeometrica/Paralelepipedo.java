package calculadoraGeometrica;

public class Paralelepipedo {
    double altura;
    double largura;
    double comprimento;

    Paralelepipedo(double altura, double largura, double comprimento){
        this.altura = altura;
        this.largura = largura;
        this.comprimento =comprimento;
    }

    double calcularVolume(){
        return this.altura * this.largura * this.comprimento;
    }
}
