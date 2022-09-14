public class LacoRep {
    public static void main(String[] args) throws{
        int contador = 0;
        while (contador <= 20){
            System.out.printf("O contador está em: %d\n",contador);
            contador++;
        }

        for(int i = 0; i <= 20 ; i++){
            System.out.println(i);
            Thread.sleep(500);
        }

    }
}
