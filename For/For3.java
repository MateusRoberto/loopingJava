package For;
import java.util.Scanner;

public class For3 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = sc.nextInt();
        double sub = 0;


        for (int i=1;i<=n;i++){
            System.out.println("Digite um numero: ");
            double n1 = sc.nextDouble();

            System.out.println("Digite outro numero: ");
            double n2 = sc.nextDouble();

            sub = n1-n2;

            System.out.println(sub);

        }
    }
}
