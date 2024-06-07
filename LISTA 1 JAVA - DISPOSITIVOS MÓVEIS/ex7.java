public class ex7 {
    public static void main(String[] args) {
        float valor = 85.90f;
        float gorjeta = 0.10f;

        float total = valor + (valor*gorjeta);
        System.out.println("O valor total foi de R$"+total+" que foram "+valor+" + "+ (gorjeta*100)+"%");
    }
}
