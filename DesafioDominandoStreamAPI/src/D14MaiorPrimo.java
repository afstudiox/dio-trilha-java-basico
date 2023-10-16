import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class D14MaiorPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(D14MaiorPrimo::isPrimo)
                .max(Integer::compareTo);

        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo é: " + maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
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

