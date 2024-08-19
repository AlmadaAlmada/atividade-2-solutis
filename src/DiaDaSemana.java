import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diasDaSemana = {
                "Segunda-feira", "Terça-feira", "Quarta-feira",
                "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"
        };

        System.out.print("Digite um número de 1 a 7: ");
        int numero = 0;

        while (numero < 1 || numero > 7) {
            System.out.print("Digite um número de 1 a 7: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 7) {
                System.out.println("Número inválido. Por favor, digite um número entre 1 e 7.");
            }
        }

        System.out.println("O dia da semana correspondente é: " + diasDaSemana[numero - 1]);

        scanner.close();
    }
}
