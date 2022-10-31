package calculadoraGeometrica;

public class Cone {
    double altura;
    double raio;

    Cone(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    double calcularVolume(){
        return (Math.PI*Math.pow(this.raio,2)*this.altura)/3;
    }
}
