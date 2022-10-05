package colisao;

import java.util.Scanner;

public class funcao {
    Scanner x = new Scanner(System.in);
    double numValid(){
        double num = 0;
        while(true){
            try{
                num = x.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Caractere Inválido");
                x.next();
            }
        }
        return num;
    }

        String opValid(){
            String opcao;
            while (true){
                try{
                    opcao = x.next();
                    break;
                }catch (Exception e){
                x.next();
            }
        }
        return opcao;
    }
}
