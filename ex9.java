import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data (DDMMANO): ");
        String data = scanner.next();

        String dia = data.substring(0, 2);
        String mes = data.substring(2, 4);
        String ano = data.substring(4);

        System.out.println("Data no formato DD/MM/ANO: " + dia + "/" + mes + "/" + ano);
    }
}