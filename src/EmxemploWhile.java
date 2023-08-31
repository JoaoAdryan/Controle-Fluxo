import java.util.concurrent.ThreadLocalRandom;
public class EmxemploWhile {
    public static void main(String[] args) {
    double mesada = 50.0;

    while(mesada>0){
        Double valorDoce = valoraleaatorio();
        if (valorDoce > mesada)
        valorDoce = mesada;

        System.out.println("Doce do valor : " + valorDoce + "Adicionando no carrinho ");
        mesada = mesada - valorDoce;

        System.out.println("Mesada : " + mesada);
        System.out.println("Joao gastou toda a sua mesada em doces");
    }
    }

    private static double valoraleaatorio() {
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
    
}
