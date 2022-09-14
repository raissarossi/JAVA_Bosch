package Bosch;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        
        int raio=5;
        final double pi =3.141;
        double areaCirculo=pi*raio*raio;
        System.out.printf("A área do circulo é %f e o raio é %d\n", areaCirculo,raio);
        System.out.println("A área do circulo é"+ areaCirculo+ " e a medida do raio é"+raio);
        

        //TIPOS DE VARIAVEIS INTEIROS
        
        byte meuByte=127;
        System.out.printf("Tamanho do Byte: %d\n", meuByte);
        short meuShort=32767;
        System.out.println("Tamanho do Short: "+meuShort);
        int meuInt=2_147_483_647;
        System.out.printf("Tamanho do Int: %d\n", meuInt);
        long meuLong=9_223_372_036_854_775_807L;
        System.out.printf("Tamanho do Long: %d\n", meuLong);*/

        //TIPOS DE VARIAVEIS REAIS
        
        float meuFloat=3.4e-38f;
        System.out.printf("Valor do float %f\n", meuFloat);
        double meuDouble=1.7e+308;
        System.out.printf("Valor de Double %f\n", meuDouble);
        System.out.printf(Math.PI);
        

        //TIPOS DE CARACTERES
        
        char meuChar='A';
        System.out.printf("Meu char é %c\n",meuChar);
        boolean meuBoolean=true;
        System.out.printf("Meu booleano é %b\n",meuBoolean);
        

        //TIPOS DE STRING
        
        String minhaString="Bosch";
        System.out.printf("Minha String é %s\n",minhaString);
        

        //TIPOS DE VARIÁVEIS
        
        var a=10;
        System.out.println(a);
        var b=3.14;
        System.out.println(b);//double
        var b1=3.14F;
        System.out.println(b1);//float
        var c ='x';
        System.out.println(c);
        var d=false;
        System.out.println(d);
        var e="Bosch";
        System.out.println(e);

        double num1=10;
        double num2=3;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        System.out.println(num1%num2);
        System.out.println(Math.pow(num1,num2));
        double potencia;
        potencia= Math.pow(10,3);
        System.out.println(potencia);
        
        //EXEMPLOS DE USO DOS SINAIS MAT
        
        System.out.println(10+2*20);
        System.out.println(10+2==6*2);
        int x=3, y=4, z=5;
        System.out.println(x<y && z>y);
        System.out.println(!(x<y) == x>y);
        System.out.println(!(y<x) && x>z || z<y);
        System.out.println(x == z - y && z != y - x || y != z - x);

    }
}
