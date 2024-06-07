import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta com 3 dígitos: ");
        String conta = scanner.next();

        int numeroConta = Integer.parseInt(conta);
        int inversoConta = Integer.parseInt(new StringBuilder(conta).reverse().toString());

        int soma = numeroConta + inversoConta;
        int resultado = 0;

        String somaStr = String.valueOf(soma);
        for (int i = 0; i < somaStr.length(); i++) {
            resultado += Character.getNumericValue(somaStr.charAt(i)) * (i + 1);
        }

        int digitoVerificador = resultado % 10;

        System.out.println("Dígito verificador: " + digitoVerificador);
    }
}

}
