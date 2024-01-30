package While;
import java.util.Scanner;
public class While5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String n = "s";




        while (n.equals("s")){ // equals() serve para comparar Srings

            System.out.println("Digite um numero: ");
            int n1 = sc.nextInt();

            System.out.println("Digite outro numero: ");
            int n2 = sc.nextInt();

            int resultado = n1+n2;

            System.out.println(n1+" + "+n2+" = "+ resultado);

            System.out.println("Deseja continuar? [S/N]");
            n = sc.next();







        }

        System.out.println("Fim da operação");

        sc.close();




        }
    }

