package DoWhile;
import java.util.Scanner;

public class doWhile {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);


        char resp;
        do{

            System.out.print("Digite a temperatura em celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c /5.0 + 32.0;
            System.out.println("O equivalente em Fahrenheit: " + f);
            System.out.println("Deseja repetir? [s/n]");
             resp = sc.next().charAt(0);


        }while (resp!='n');
        sc.close();
    }
}
