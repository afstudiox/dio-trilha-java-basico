import java.util.Arrays;
import java.util.List;

public class D6ExisteNumeroMaiorQueDez {
    public static void main(String[] args) {
         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

            boolean existeNumeroMaiorQueDez = numeros.stream()
            .anyMatch(numero -> numero > 10);

            if (existeNumeroMaiorQueDez) {
                System.out.println("Existe número maior que dez");
            } else {
                System.out.println("Não existe número maior que dez");
            }
    }
}
