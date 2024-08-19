import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String vogais = "aeiou";

        System.out.print("Digite uma frase ou palavra: ");
        String entrada = scanner.nextLine();

        entrada = entrada.toLowerCase();

        int contVogais = 0;
        int contConsoantes = 0;
        int contEspacos = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);

            if (vogais.indexOf(c) != -1) {
                contVogais++;
            }
            else if (c == ' ') {
                contEspacos++;
            }
            else if (c >= 'a' && c <= 'z') {
                contConsoantes++;
            }
        }

        System.out.println("Quantidade de vogais: " + contVogais);
        System.out.println("Quantidade de consoantes: " + contConsoantes);
        System.out.println("Quantidade de espaços em branco: " + contEspacos);

        scanner.close();
    }
}
