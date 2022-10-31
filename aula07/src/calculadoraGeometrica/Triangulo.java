package calculadoraGeometrica;

public class Triangulo {
    double base;
    double altura;

    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    double calcularArea(){
        return ((this.base * this.altura)/2);
    }
    double calcularPerimetro(){
        double trig1 = Math.pow((base/2),2) + Math.pow(altura,2);
        double trig2 = Math.sqrt(trig1);
        return (trig2 + trig2 + base);
    }
}
