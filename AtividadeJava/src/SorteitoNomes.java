import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteitoNomes {
    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();
        nomes.add("Marcelo");
        nomes.add("luzia");
        nomes.add("Nascimento");
        nomes.add("Ferreira");
        nomes.add("Mendes");
        nomes.add("Medina");
        nomes.add("Luma");
        nomes.add("Ana Mendes");
        nomes.add("Jaqueline");
        nomes.add("Eliete");
        // Criação de um objeto Random
        Random random = new Random();
        // Geração de um índice aleatório
        int indiceSorteado = random.nextInt(nomes.size());
        // Obtenção do nome sorteado
        String nomeSorteado = nomes.get(indiceSorteado);

        // Impressão do nome sorteado
        System.out.println("O nome sorteado para fazer a faxina HOJE é: " + nomeSorteado);



    }












}
