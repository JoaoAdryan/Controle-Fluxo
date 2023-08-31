public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota= 10;

        if(nota>=7)
        System.out.println("Aprovado");

        else if(nota>=5 && nota<7)
        System.out.println("Recuperação ");
        // o " && " cria uma nova condição

        else
        System.out.println("Reprovado");




        //esse é outro jeito de fazer o codigo acima, um modo de abreviação 
        // do bloco encandiado 
        int notas = 6;
        String resultado = notas>= 7 ? "Aprovado" : notas >=5 && notas <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
         
    }
    
}
