import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x = n.nextInt();
        if( x % 2 == 0) {
            System.out.println("É par :)");
        }
        else
            System.out.println("É impar :/");

    }
}
