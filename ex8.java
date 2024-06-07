import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        // Criação de scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora (0-23): ");
        int hora = scanner.nextInt();

        System.out.print("Informe os minutos (0-59): ");
        int minutos = scanner.nextInt();

        int minutosPassados = (hora * 60) + minutos;
        
        System.out.printf("Total de minutos passados desde o início do dia: %d minutos\n", minutosPassados);

        scanner.close();
    }
}
