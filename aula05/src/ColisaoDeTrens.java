import java.util.Scanner;

public class ColisaoDeTrens {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("POSIÇÃO DO TREM A:");
        double pA = x.nextDouble();
        System.out.println("POSIÇÃO DO TREM B:");
        double pB = x.nextDouble();
        double pnB = pB *-1;
        System.out.println("VELOCIDADE DO TREM A:");
        double vA = x.nextDouble();
        System.out.println("VELOCIDADE DO TREM B:");
        double vB = x.nextDouble();

        if (((-pA)+pnB)>10000){
            System.out.println("A DISTÂNCIA ENTRE AS POSIÇÕES DEVEM SER DE NO MÁXIMO 10.000KM");
        }


    }
}
