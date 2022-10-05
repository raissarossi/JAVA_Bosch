package colisao;

import java.util.Locale;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        while (true) {
            funcao fun = new funcao();
            double S0a = 0;
            double S0b = 0;
            while (true) {
                System.out.println("S0a:");
                S0a = fun.numValid();
                if (S0a < 0 || S0a > 10000) {
                    System.out.println("A POSIÇÃO DO TREM [A] DEVE ESTAR ENTRE 0 E 10000");
                } else {
                    break;
                }
            }

            while (true) {
                do {
                    System.out.println("S0b:");
                    S0b = fun.numValid();

                    if (S0a > S0b) {
                        System.out.println("PARA QUE EXISTA COLISÃO O [B] PRECISA SER MAIOR QUE [A]");
                    }
                } while (S0a > S0b);
                if (S0b > 10000) {
                    System.out.println("A POSIÇÃO DO TREM [B] DEVE ESTAR ENTRE 0 E 10000");
                } else {
                    break;
                }
            }

            double Va = 0;
            double Vb = 0;

            while (true) {
                System.out.println("Va:");
                Va = fun.numValid();
                if (Va < 0) Va = Va * (-1);
                if (Va > 300) {
                    System.out.println("O LIMITE DO MÓDULO DE VELOCIDADE É 300KM/H");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.println("Vb:");
                Vb = fun.numValid();
                if (Vb > 0) Vb = Vb * (-1);
                if (Vb < -300) {
                    System.out.println("O LIMITE DO MÓDULO DE VELOCIDADE É 300KM/H");
                } else {
                    break;
                }
            }
            double tempo = (S0a - S0b) / (Vb - Va);
            double Sa = S0a + Va * tempo;
            double Sb = S0b + Vb * tempo;
            if (Sb - Sa == 0) {
                System.out.println("COLISÃO: " + Sa);
            } else {
                System.out.println("ELES NÃO COLIDIRAM");
            }
            System.out.println("TEMPO: " + tempo * 3600);
            String opcao;
            while(true) {

                System.out.println("DESEJA REALIZAR OUTRO CÁLCULO? [S]  [N]");
                opcao = fun.opValid().toLowerCase();
                System.out.println(opcao);
                if (!(opcao.equals("n") || opcao.equals("s"))) {
                    System.out.println("ERRO");
                    continue;
                }else break;
            }
            if (opcao.equals("n")) {
                break;
            }

        }
    }
}
