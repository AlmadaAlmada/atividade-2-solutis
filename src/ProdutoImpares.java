public class ProdutoImpares {
    public static void main(String[] args) {
        int pInt = 1;
        float pFloat = 1.0F;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                pInt *= i;
                pFloat *= i;
            }
        }

        System.out.println("Produto dos números ímpares de 15 a 30 (int): " + pInt);
        System.out.println("Produto dos números ímpares de 15 a 30 (float): " + pFloat);
    }
}
