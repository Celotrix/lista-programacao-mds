public class Atividade3 {
    public static void main(String[] args) {
        //3. Declare: qtdAlunos (inteiro), mediaTurma (real), aprovada (booleano) e professor (texto).
        //Atribua valores e exiba tudo.


        int qtdAlunos = 25;
        double media = 52.2;
        boolean aprovado = true;

        String Professor = "Victor";

        System.out.println("Alunos do Professor:"+Professor+
                "\nQuantidade de alunos: "+qtdAlunos+
                "\nMédia:"+media);
               if (aprovado == true) {
                   System.out.println("Aluno aprovado!");
               }else{
                   System.out.println("Aluno reprovado!");
               }

    }
  }

