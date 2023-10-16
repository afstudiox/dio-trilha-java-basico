import java.util.Arrays;
import java.util.List;

public class D17FiltrarNumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> primos = numeros.stream()
                .filter(D17FiltrarNumerosPrimos::isPrimo)
                .toList();

        System.out.println("Números primos: " + primos);
    }



    private static boolean isPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
