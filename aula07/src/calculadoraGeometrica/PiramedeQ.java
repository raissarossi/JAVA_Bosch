package calculadoraGeometrica;

public class PiramedeQ {
    double lado;
    double altura;

    PiramedeQ(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }
    double calcularVolume(){
        double base = this.lado * 2;
        return (base * this.altura)/3;
    }
}
