package For;
import java.util.Scanner;

public class For4 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1 = sc.nextInt();

        for (int i=0;i<n1;i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
