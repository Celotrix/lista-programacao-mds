import java.util.Scanner;

public class AtividadeEmSala10 {
    public static void main(String[] args) {
        // Estrutura WHILE

        int x = 5, contador = 0;

        while (contador <=10) {
            System.out.println(x + "*" + contador + " = " + (x * contador));
            contador++;

            // Componha um script que receba um valor inteiro do usuário e que retorne a
            // a tabuáda de multiplicação, de 0 a 10, equivalente.
            // Imprima a tabuáda mantendo o padrão abaixo de formatação:
        /*
            Tabuáda do número X:

            X * 0 = ?
         */
        }
            Scanner leia = new Scanner(System.in);

            System.out.println("Digite um numero inteiro de 0 a 10");
            int numero = leia.nextInt();
            contador = 0;


            System.out.println("Taboada de  " + numero + " é:");
            while (contador <=10){
                System.out.println(x + "*" + contador + " = " + (x * contador));
                contador++;


        }

    }
}
