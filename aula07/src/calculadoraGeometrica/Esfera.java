package calculadoraGeometrica;

public class Esfera {
    double raio;

    Esfera(double raio){
        this.raio = raio;
    }

    double calcularVolume(){
        return (4/3)*Math.PI*Math.pow(this.raio,3);
    }
}
