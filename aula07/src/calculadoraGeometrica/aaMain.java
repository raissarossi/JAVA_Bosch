package calculadoraGeometrica;

import java.util.Scanner;

public class aaMain {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    QUAL TIPO DE FORMA GEOMÉTRICA DESEJA CALCULAR?
                    [0]- SAIR
                    [1]- FIGURAS PLANAS
                    [2]- FIGURAS ESPACIAIS""");
            String menuu = e.next();
            try {
                Double menu = Double.parseDouble(menuu);
                System.out.println("okk");
            }
            catch(Exception e){
                System.out.println("ERRO");
                System.out.println("""
                    QUAL TIPO DE FORMA GEOMÉTRICA DESEJA CALCULAR?
                    [0]- SAIR
                    [1]- FIGURAS PLANAS
                    [2]- FIGURAS ESPACIAIS""");
            }
            if (menu == 1) {
                while (true){
                System.out.println("""
                        ESCOLHA A FIGURA PLANA:
                        [0]- VOLTAR
                        [1]- QUADRADO
                        [2]- RETÂNGULO
                        [3]- CÍRCULO
                        [4]- TRIÂNGULO
                        [5]- HEXÁGONO REGULAR""");
                int escolha = e.nextInt();
                if (escolha == 1) {
                    System.out.println("Lado: ");
                    double l = e.nextDouble();
                    Quadrado q1 = new Quadrado(l);
                    System.out.println("QUADRADO");
                    System.out.println("ÁREA: " + q1.calcularArea());
                    System.out.println("PERÍMETRO: " + q1.calcularPerimetro());
                }
                else if (escolha == 2) {
                    System.out.println("Lado 1: ");
                    double l1 = e.nextDouble();
                    System.out.println("Lado 2: ");
                    double l2 = e.nextDouble();
                    Retangulo r1 = new Retangulo(l1, l2);
                    System.out.println("RETÂNGULO");
                    System.out.println("ÁREA: " + r1.calcularArea());
                    System.out.println("PERÍMETRO: " + r1.calcularPerimetro());
                }
                else if (escolha == 3) {
                    System.out.println("Raio: ");
                    double r = e.nextDouble();
                    Circulo c1 = new Circulo(r);
                    System.out.println("CÍRCULO");
                    System.out.println("ÁREA: " + c1.calcularArea());
                    System.out.println("PERÍMETRO: " + c1.calcularPerimetro());
                }
                else if (escolha == 4) {
                    System.out.println("Base: ");
                    double b = e.nextDouble();
                    System.out.println("Altura: ");
                    double a = e.nextDouble();
                    Triangulo t1 = new Triangulo(b, a);
                    System.out.println("TRIÂNGULO");
                    System.out.println("ÁREA: " + t1.calcularArea());
                    System.out.println("PERÍMETRO: " + t1.calcularPerimetro());
                }
                else if (escolha == 5) {
                    System.out.println("Lado: ");
                    double l = e.nextDouble();
                    Hexagono h1 = new Hexagono(l);
                    System.out.println("HEXÁGONO");
                    System.out.println("ÁREA: " + h1.calcularArea());
                    System.out.println("PERÍMETRO: " + h1.calcularPerimetro());
                }
                else if (escolha == 0){
                    break;
                }
                else{
                    System.out.println("INSIRA UMA OPÇÃO VÁLIDA");
                }
            }}

            else if (menu == 2) {
                while (true){
                System.out.println("""
                        ESCOLHA A FIGURA ESPACIAL:
                        [0]- VOLTAR
                        [1]- CUBO
                        [2]- PARALELEPIPEDO
                        [3]- ESFERA
                        [4]- PIRÂMEDE DE BASE QUADRADA
                        [5]- CONE
                        [6]- CILINDRO""");
                int escolha = e.nextInt();
                if (escolha == 1) {
                    System.out.println("Lado: ");
                    double l = e.nextDouble();
                    Cubo c1 = new Cubo(l);
                    System.out.println("CUBO");
                    System.out.println("VOLUME: " + c1.calcularVolume());
                }
                else if (escolha == 2) {
                    System.out.println("Altura: ");
                    double a = e.nextDouble();
                    System.out.println("Largura: ");
                    double l = e.nextDouble();
                    System.out.println("Comprimento: ");
                    double c = e.nextDouble();
                    Paralelepipedo p1 = new Paralelepipedo(a, l, c);
                    System.out.println("PARALELEPÍPEDO");
                    System.out.println("VOLUME: " + p1.calcularVolume());
                }
                else if (escolha == 3) {
                    System.out.println("Raio: ");
                    double r = e.nextDouble();
                    Esfera e1 = new Esfera(r);
                    System.out.println("ESFERA");
                    System.out.println("VOLUME: " + e1.calcularVolume());
                }
                else if (escolha == 4) {
                    System.out.println("Lado da base: ");
                    double l = e.nextDouble();
                    System.out.println("Altura: ");
                    double a = e.nextDouble();
                    PiramedeQ p1 = new PiramedeQ(l, a);
                    System.out.println("PIRÂMEDE DE BASE QUADRADA");
                    System.out.println("VOLUME: " + p1.calcularVolume());
                }
                else if (escolha == 5) {
                    System.out.println("Raio da base: ");
                    double r = e.nextDouble();
                    System.out.println("Altura: ");
                    double a = e.nextDouble();
                    Cone c1 = new Cone(r, a);
                    System.out.println("CONE");
                    System.out.println("VOLUME: " + c1.calcularVolume());
                }
                else if (escolha == 6) {
                    System.out.println("Raio da base: ");
                    double r = e.nextDouble();
                    System.out.println("Altura: ");
                    double a = e.nextDouble();
                    Cilindro c1 = new Cilindro(r, a);
                    System.out.println("CILINDRO");
                    System.out.println("VOLUME: " + c1.calcularVolume());
                }
                else if (escolha == 0){
                    break;
                }
                else{
                    System.out.println("INSIRA UMA OPÇÃO VÁLIDA");
                }
            }}
            else if (menu == 0){
                break;
            }
            else {
                System.out.println("INSIRA UMA OPÇÃO VÁLIDA");
            }
        }
    }
}
