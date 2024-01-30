
package While;
import java.util.Scanner;

public class Wilhe6 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quais dos produtos tem a sua preferência? [1] álcool [2] gasolina [3] diesel");
        int n1 = sc.nextInt();

        int a = 0;
        int g = 0;
        int d = 0;


        while (n1!=4){
            if (n1==1){
                a = a+1;
            } else if (n1==2) {
                g = g+1;

            } else if (n1==3) {
                d = d+1;

            }
            n1 = sc.nextInt();
        }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+d);
    }
}
