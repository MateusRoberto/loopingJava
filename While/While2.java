import java.util.Scanner;

public class While2 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastre uma senha : ");
        int senha = sc.nextInt();

        System.out.println("Digite sua senha: ");
        int senhatent = sc.nextInt();


        while (senhatent!=senha){
            System.out.println("Senha invalida");

            senhatent = sc.nextInt();
        }

        System.out.println("Senha Correta");


    }

}
