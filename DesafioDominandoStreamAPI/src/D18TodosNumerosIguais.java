import java.util.Arrays;
import java.util.List;

public class D18TodosNumerosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        Boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)) );

        if (todosIguais) {
            System.out.println("Todos os números são iguais");
        } else {
            System.out.println("Os números não são todos iguais");
        }
    }
}
