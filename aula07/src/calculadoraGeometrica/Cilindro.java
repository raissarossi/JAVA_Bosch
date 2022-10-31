package calculadoraGeometrica;

public class Cilindro {
    double altura;
    double raio;

    Cilindro(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    double calcularVolume(){
        return Math.PI*Math.pow(this.raio,2)*this.altura;
    }
}
