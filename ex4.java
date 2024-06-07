public class ex4 {
    public static void main(String[] args) {
        int custo = 100;
        float valorDistribuidor = 0.28f;
        float valorImposto = 0.45f;

        float imposto = custo * valorImposto;
        float custoImposto = custo + imposto;

        float distribuidor= custo * valorDistribuidor;
        float custoDistribuidor= custo + distribuidor;

        float total = custoDistribuidor + custoImposto;
        System.out.println("O custo ao consumidor do carro é: R$" + total);
    }
}
