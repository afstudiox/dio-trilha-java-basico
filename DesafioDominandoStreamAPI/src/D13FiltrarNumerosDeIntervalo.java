import java.util.Arrays;
import java.util.List;

public class D13FiltrarNumerosDeIntervalo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int min = 5;
        int max = 7;

        numeros.stream()
            .filter(n -> n >=min && n <= max)
            .forEach(System.out::println);

    }
}
