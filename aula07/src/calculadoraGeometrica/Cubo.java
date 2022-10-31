package calculadoraGeometrica;

public class Cubo {
    double lado;

    Cubo(double lado){
        this.lado = lado;
    }

    double calcularVolume(){
        return Math.pow(this.lado,3);
    }
}
