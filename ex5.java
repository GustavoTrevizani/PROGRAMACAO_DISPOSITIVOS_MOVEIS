public class ex5 {
    public static void main(String[] args) {
        int salario = 1200;
        int conta1=200;
        int conta2=120;
        float multa = 0.02f;

        float conta1Multa=conta1*multa;
        float conta2Multa=conta2*multa;
        float contaTotal = (conta1+conta1Multa) + (conta2+conta2Multa);

        System.out.println("Restara do salário de João R$"+(salario-contaTotal));
    }
}
