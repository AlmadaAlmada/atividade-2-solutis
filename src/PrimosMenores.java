import java.util.Scanner;

public class PrimosMenores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Números primos menores que " + numero + ":");
        for (int i = 2; i < numero; i++) {
            if (ePrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
