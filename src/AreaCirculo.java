import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double areaArredondada = Math.round(area);

        System.out.println("A área do círculo é: " + areaArredondada);

        scanner.close();
    }
}
