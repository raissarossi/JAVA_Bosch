package calculadoraGeometrica;

public class Retangulo {
    double lado1;
    double lado2;

    Retangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    double calcularArea(){
        return (this.lado1 * this.lado2);
    }
    double calcularPerimetro(){
        return ((this.lado1*2) + (this.lado2*2));
    }
}
