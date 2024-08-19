import java.util.Scanner;

public class CompararPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra 1: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a palavra 2: ");
        String palavra2 = scanner.nextLine();

        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (palavra1.compareTo(palavra2) > 0) {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais.");
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra \"" + palavra1 + "\" tem mais");
        } else if (palavra2.length() > palavra1.length()) {
            System.out.println("A palavra \"" + palavra2 + "\" tem mais");
        } else {
            System.out.println("As duas palavras têm o mesmo número de caracteres");
        }

        scanner.close();
    }
}
