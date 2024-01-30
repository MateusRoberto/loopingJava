import java.util.Scanner;

public class While {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero");
        int n1 = sc.nextInt();
        int soma = 0;

        while (n1!=0) {
            soma = soma+n1;

            n1 = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();


    }
}


