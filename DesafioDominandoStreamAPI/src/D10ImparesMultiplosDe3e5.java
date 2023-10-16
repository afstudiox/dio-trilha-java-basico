import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class D10ImparesMultiplosDe3e5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<String, List<Integer>> numerosAgrupados = numeros.stream()
                .filter(num -> num % 2 != 0) // Seleciona os números ímpares
                .filter(num -> num % 3 == 0 || num % 5 == 0) // Seleciona múltiplos de 3 ou 5
                .collect(Collectors.groupingBy(
                        num -> num % 3 == 0 ? "Múltiplos de 3" : "Múltiplos de 5"
                ));

        //Exibe o resultado
        numerosAgrupados.forEach((key, value) -> {
            System.out.println("Grupo: " + key);
            System.out.println("Numeros: " + value);
            System.out.println();
        });
    }
}
