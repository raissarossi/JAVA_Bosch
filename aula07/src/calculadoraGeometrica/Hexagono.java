package calculadoraGeometrica;

public class Hexagono {
    double lado;

    Hexagono(double lado){
        this.lado = lado;
    }

    double calcularArea(){
        return ((3*Math.sqrt(3)*Math.pow(this.lado,2))/2);
    }
    double calcularPerimetro(){
        return (this.lado*6);
    }
}
