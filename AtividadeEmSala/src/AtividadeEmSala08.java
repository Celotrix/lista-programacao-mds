
import java.util.Scanner;
public class AtividadeEmSala08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome = "";
        int idade = 0;

        System.out.println("Digite o seu nome");
        nome = leia.nextLine();

        System.out.println("Digite sua idade");
        idade = leia.nextInt();

        System.out.println("Seu nome é:" + nome);
        System.out.println("Voce tem : " + idade + " anos de idade.");




    }


}

