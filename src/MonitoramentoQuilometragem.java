import java.util.Scanner;

public class MonitoramentoQuilometragem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quilometragemTotal = 0;
        int litrosTotais = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite os quilômetros dirigidos: ");
            int quilometros = scanner.nextInt();

            System.out.print("Digite os litros de gasolina consumidos: ");
            int litros = scanner.nextInt();

            double consumo = (double) quilometros / litros;

            quilometragemTotal += quilometros;
            litrosTotais += litros;

            System.out.printf("O consumo para este tanque foi de: %.2f km/L%n", consumo);
            System.out.println("Quilometragem total até agora: " + quilometragemTotal + " km");
            System.out.println("Total de litros consumidos até agora: " + litrosTotais + " L");

            System.out.print("Deseja adicionar outro tanque? (s/n): ");
            continuar = scanner.next();
        }

        scanner.close();
    }
}

