import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        String situacao;
        boolean pp;

        Scanner n = new Scanner(System.in);
        System.out.println("NOTA:");
        double nota = n.nextDouble();

        Scanner f = new Scanner(System.in);
        System.out.println("FREQUENCIA:");
        double frequencia = f.nextDouble();

        Scanner p = new Scanner(System.in);
        System.out.println("POSTURA:");
        String postura = p.nextLine();
        if(postura.equalsIgnoreCase("s")){
            pp = true;
        }
        else{
            pp = false;
        }


        if(nota>=5.0 && frequencia>=75 && pp==true){
            situacao = "APROVADO";
        }
        else if(nota<5.0 && frequencia>=75 && pp==true){
            situacao = "RECUPERAÇÃO DE PROVA";
        }
        else if(nota>5.0 && frequencia<75 && pp==true){
            situacao = "RECUPERAÇÃO DE PROVA";
        }
        else if(nota>5.0 && frequencia>75 && pp==false){
            situacao = "CHAMAR PARA CONVERSAR";
        }
        else{
            situacao="REPROVADO";
        }

        System.out.println(situacao);
    }
}
