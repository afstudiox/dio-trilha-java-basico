import java.util.Arrays;
import java.util.List;

public class D15TemNegativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        boolean contemNegativo = numeros.stream()
            .anyMatch(n -> n < 0);

        if (contemNegativo) {
            System.out.println("A lista contém pelo menos um número negativo.");
        } else {
            System.out.println("A lista não contém números negativos.");
        }
    }
}
