public class Wrapper {
    public static void main(String[] args) {
        //WRAPPER
        Byte b = 100;
        Short s = 100;
        Integer i = 10000;
        Long l = 100000L;
        System.out.println(b.byteValue());
        System.out.println(s.toString());
//----------------------------------------------------------------------------------------------------------------------
        Integer num1 = 10000;
        System.out.println(num1.toString().length());
        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());

        System.out.println((""+num2).length());
//----------------------------------------------------------------------------------------------------------------------
        String numero1 = "12";
        String numero2 = "3.14";
        int x = Integer.parseInt(numero1);
        double y = Double.parseDouble(numero2);
        double soma = x+y;
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
        System.out.println("Soma= "+soma);
//----------------------------------------------------------------------------------------------------------------------
        double e = 1.999938976;
        int f = (int) e;
//        System.out.println(f);

    }
}
