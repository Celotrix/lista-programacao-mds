import java.util.Scanner;
public class AtividadeEmSala09 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero inteiro de 1 a 10");
        int numero = leia.nextInt();

        do{
            numero++;
            System.out.println(" Vezes que o do/while    " + numero);
        }while(numero < 10);

        boolean sair = false;

        do{
            System.out.println("escolha uma das opções baixo:");
            System.out.println(
                    "1 - Cadastrar novo usuário \n" +
                    "2 - Editar Usuário  \n" +
                    "3 - Excluir usuário  \n" +
                    "0 - sair \n"

                    );
            int opcao = leia.nextInt();
            switch (opcao){
                case  0:
                    sair = true;
                    break;
                case 1:
                    System.out.println("Cadastrar novo Usuário");
                    break;
                            }



        }while(!sair);

    }
}
