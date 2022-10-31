package calculadoraGeometrica;

public class Circulo {
    double raio;

    Circulo(double raio){
        this.raio = raio;
    }

    double calcularArea(){
        return (Math.PI*Math.pow(this.raio,2));
    }
    double calcularPerimetro(){
        return (2*Math.PI*this.raio);
    }
}
