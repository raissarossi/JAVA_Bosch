package calculadoraGeometrica;

public class Quadrado {
    double lado;

    Quadrado(double lado){
        this.lado = lado;
    }

    double calcularArea(){
        return Math.pow(this.lado,2);
    }
    double calcularPerimetro(){
        return lado * 4;
    }

}
