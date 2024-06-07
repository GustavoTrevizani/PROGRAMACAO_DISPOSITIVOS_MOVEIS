public class ex2 {
    public static void main(String[] args) {
        int tam = 100;
        int litroPorLata= 18;
        int valorLata= 80;

        float litroPorTam = tam / 3;
        int quantLatas = (int) Math.ceil(litroPorTam / litroPorLata);

        float valor = quantLatas * valorLata;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + quantLatas +" Preço total: R$"+valor);
    }
}
