import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //1- CONVERTER F° TO C°
        Scanner f = new Scanner(System.in);
        System.out.println("Type in Fahrenheit: ");
        double fihrenheit = f.nextDouble();
        double celsius = (fihrenheit-32)*5/9;
        System.out.println("Celsius: "+ celsius);

        //2- CONVERTER C° TO F°
        Scanner c = new Scanner(System.in);
        System.out.println("Type in Celsius: ");
        double celsius = c.nextDouble();
        double fihrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit: "+ fihrenheit);

        //3- WEIGHT AND HEIGHT TO IMC
        Scanner w = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = w.nextDouble();
        Scanner h = new Scanner(System.in);
        System.out.println("Enter your height: ");
        double height = h.nextDouble();
        double imc = (weight/(height*height));
        System.out.println("Your IMC is: "+imc);

        //4- RESULT SQUARED AND CUBED
        Scanner n = new Scanner(System.in);
        System.out.println("Type a number: ");
        double number = n.nextDouble();
        double pow2;
        pow2 = Math.pow(number,2);
        double pow3;
        pow3 = Math.pow(number,3);
        System.out.println("Squared: "+pow2+"\nCubed: "+pow3);

        //5- TRIANGLE AREA
        Scanner b = new Scanner(System.in);
        System.out.println("triangle base: ");
        float base = b.nextFloat();
        Scanner h = new Scanner(System.in);
        System.out.println("triangle height: ");
        float height = h.nextFloat();
        float area = (base*height)/2;
        System.out.println("Triangle area: "+area);

        //6- BHASKARA
        Scanner a = new Scanner(System.in);
        System.out.println("Let's calculate bhaskara\na=");
        double aa = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.println("b=");
        double bb = b.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.println("c=");
        double cc = c.nextDouble();
        double bb2 = Math.pow(bb,2);
        double delta = Math.pow(bb,2)-4*aa*cc;
        double x1 = ((-bb + Math.sqrt(delta))/(2*aa));
        double x2 = ((-bb - Math.sqrt(delta))/(2*aa));
        System.out.println("delta= "+delta);
        System.out.println("X1= "+x1+"\nX2= "+x2);

        //7- CALCULATION
        //1
        double a = -3.0/4;
        double count1 = (3*Math.pow((a),-2));
        double count1_1 = 6*(Math.pow(3,-1)/4)-4;
        double count2 = 7*Math.pow(a,-1)+2;
        double up = count1 + count1_1;
        double key = Math.pow(up/count2,-1);
        double result = key + 4;
        System.out.println("a. "+result);
        //2
        double countt = Math.pow((((3*Math.pow(-3.0/4,-2))+(6*(Math.pow(3.0,-1)/4)-4))/(7*Math.pow(-3.0/4,-1)+2)),-1)+4;
        System.out.println("b. "+countt);

    }

}

