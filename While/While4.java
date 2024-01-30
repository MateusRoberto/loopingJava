package While;
import java.util.Scanner;
public class While4 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero limite");
        int i = sc.nextInt();

        int x = 0;

        while (x<=i){
            System.out.print(x+"|");
            x = x+1;
        }
    }
}
