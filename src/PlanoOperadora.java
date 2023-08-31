public class PlanoOperadora {
    public static void main(String[] args) throws Exception {
        String plano = "M";

        //  NESSE É O CASO DO IF E ELSE, FUNCIONA NORMALMENTE
        // if(plano == "B"){
        //     System.out.println("100 minutos de ligação");
        // }
        //     else if (plano == "M"){
        //         System.out.println("100 minutos de ligação");
        //         System.out.println("Whats e instagram gráris");
        //     }
        //     else if (plano == "T"){
        //         System.out.println("100 minutos de ligação");
        //         System.out.println("Whats e instagram grátis ");
        //         System.out.println("5gb, Youtube");
        //     }
         switch(plano){ /*
             aqui se você digitar a letra T vai aparecer as 3 mensagens
            // como nao tem break o código vai rodar tudo até um certo ponto 
            ent se você aperta a letra M vai aparecer a mensagem apenas da letra B e letra M*/
            case "T": {
                System.out.println("5gb e Youtubes");

            }
            case "M": {
                System.out.println("Whats e instagram grátis");

            }

            case "B": {
                System.out.println("100 minutos de ligação");
            }
         }






    }
}
