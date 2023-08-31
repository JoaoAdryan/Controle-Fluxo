public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[]= { "Felipe", "Jonas", "Julia", "Marcos"};

        //esse é um jeito de fazer
        for (int x=0; x< alunos.length; x++){
            System.out.println(" O aluno no indice x = " + x + " é " + alunos [ x ]);
        }
        /*Essa é a forma abreviada
        quando se coloca os dois pontos ele diz que a cada interação de alunos o aluno do indice atual vai a
        atualizar automaticamente essa variavel
        for (String aluno : Alunos) {
            System.out.println("Nome do aluno é :" + aluno);

        }
        */
    }
    
}
