import java.util.Scanner;

public class VerificaLeituraInversa {
    public static boolean eInversa(String palavra) {
        int esquerda = 0;
        int direita = palavra.length() - 1;
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {

                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (eInversa(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" pode ser lida ao inverso");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não pode ser lida ao inverso");
        }
        scanner.close();
    }
}
