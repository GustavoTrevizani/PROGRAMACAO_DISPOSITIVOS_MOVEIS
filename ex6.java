public class ex6 {
    public static void main(String[] args) {
        int comprimento = 4000;
        int voltas = 70;
        int quantAbastecimento = 3;
        float consumo = 3.5f;

        int voltaAbast = voltas / (quantAbastecimento+1);
        float distanciaAbast = voltaAbast * (comprimento/1000);
        float litros = (int) Math.ceil(distanciaAbast/consumo);

        System.out.printf("Número mínimo de litros necessários para percorrer até o primeiro reabastecimento: %.2f litros\n", litros);
    }
}
