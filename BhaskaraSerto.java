import java.util.Scanner;

public class BhaskaraSerto {
    public static int VerificarSinal (String num){
        int sinal = -1;
        int mais = num.indexOf("+",1);
        int menos = num.indexOf("-",1);
        //System.out.println("valorDeMenos "+menos);
        if (mais == -1){
            mais = menos+1;
        }
        if (menos == -1){
            menos = mais+1;
        }

        sinal = (mais < menos?mais:menos);

        return sinal;
    }



    public static void main(String[] args) {
        
        System.out.println("Ola bom dia, para funcionar corretamente digite a equacao reduzida:\n");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        num = num.replaceAll(",", ".");
        if (num.indexOf("-")==0){}//do nothing
        else if (num.indexOf("+")==0){}//do nothing
        else{
            num = "+" + num;
        }
        num = num + "+";
        num = num + "=";
        num = num.toUpperCase();
        num = num.replace("²", "^2");

        //System.out.println("VALOR DO NUM: "+num);
        

        double valorA = 0;
        double valorB = 0;
        double valorC = 0;

        String stringA;
        String stringB;

            for (int x = 0 ;x <3;x++){
                int sinal = VerificarSinal(num);
                String Separador = num.substring(0, sinal);

                //System.out.println("separador: "+Separador);
                if (Separador.endsWith("X^2")){
                    int a =Separador.lastIndexOf("X^2");
                    stringA = Separador.substring(0,a);
                    valorA = Double.parseDouble(stringA);
                    System.out.println("O 'A' VALE: "+valorA+"\n");
                    //SEPARAR DO RESTO
                    num = num.substring(sinal, (num.lastIndexOf("=")+1));
                    //System.out.println("NOVO VALOR DE NUM: "+num);
                }

                if (Separador.endsWith("X")){
                    int b =Separador.lastIndexOf("X");
                    stringB = Separador.substring(0,b);
                    valorB = Double.parseDouble(stringB);
                    System.out.println("O 'B' VALE: "+valorB+"\n");
                    //SEPARAR DO RESTO
                    num = num.substring(sinal, (num.lastIndexOf("=")+1));
                    //System.out.println("NOVO VALOR DE NUM: "+num);
                }

                if ((!Separador.endsWith("X^2"))&&(!Separador.endsWith("X"))){
                    Separador = Separador.substring(VerificarSinal(Separador));
                    valorC = Double.parseDouble(Separador);
                    System.out.println("O 'C' VALE: "+valorC+"\n");
                    //SEPARAR DO RESTO
                    num = num.substring(sinal, (num.lastIndexOf("=")+1));
                    //System.out.println("NOVO VALOR DE NUM: "+num);
                }
                
            }
            double delta = (Math.pow(valorB, 2)) - (4*valorA*valorC);

            System.out.println("O VALOR DE DELTA É: "+delta);

            if (delta < 0){
                System.out.println("DELTA NEGATIVO");
            }else{
            double x1 = ((-valorB + Math.sqrt(delta))/(2*valorA));
            double x2 = ((-valorB - Math.sqrt(delta))/(2*valorA));
            System.out.println("O VALOR DE X1 FOI: "+x1);
            System.out.println("O VALOR DE X2 FOI: "+x2);
            }
    }
}
