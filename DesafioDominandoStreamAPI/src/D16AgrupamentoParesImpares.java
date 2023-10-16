import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class D16AgrupamentoParesImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        Map<String, List<Integer>> numerosAgrupados = numeros.stream()
            .collect(Collectors.groupingBy(
                n -> n % 2 == 0 ? "Pares" : "Impares"    
        ));

        numerosAgrupados.forEach((key, value) -> {
            System.out.println("Números " + key + ": " + value);
        });
    }
}
