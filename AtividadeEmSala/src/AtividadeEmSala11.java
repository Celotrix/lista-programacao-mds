import java.util.Scanner;

public class AtividadeEmSala11 {
    public static void main(String[] args) {

        // Estrutura PARA (FOR)
        Scanner leia = new Scanner(System.in);
        double nota1 = 0,nota2 = 0,nota3 = 0, media = 0;

                for(int i = 0; i < 3; i++){
            System.out.println("Digite o valor da" +(i+1)+"ª nota:");
            switch (i){
                case  0:
                    nota1 = leia.nextDouble();
                    break;
                case 1:
                    nota2 = leia.nextDouble();
                    break;
                case 2:
                    nota3 = leia.nextDouble();
                    break;
                default:
                    media = (nota1 + nota2 + nota3)/3;
                System.out.println("A média das notas digitadas é:" + media);

                break;


            }



            }


        }

    }

