public class AtividadeEmSala06 {
    public static void main(String[] args) {
 int a = 0, b = 0, x = 0 , y = 0;
 boolean teste, verdadeiro = true, falso = false;
         teste = (a > b) || (a < b);
         System.out.println("(a > b) || (a < b) " + teste);
         teste = (x > a) && ( y > a);
         System.out.println("(a > b)  || (a < b)" + teste);
         teste = !verdadeiro;
        System.out.println("Negação de um valor verdadeiro");


        teste = !verdadeiro || falso;
        System.out.println("!verdadeiro || falso; = " + teste);
        teste = !(falso || falso) && verdadeiro;
        System.out.println("!(falso || falso) && verdadeiro = " + teste);
        teste = verdadeiro || falso && verdadeiro;
        System.out.println("verdadeiro || falso && verdadeiro = " + teste);
        teste = verdadeiro && ! (falso && falso);
        System.out.println("verdadeiro && ! (falso && falso) = " + teste);
        



    }
}
