import java.util.Arrays;
import java.util.List;

public class D19DivisiveisPor3E5 {
    public static void main(String[] args) {
         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

         int somaDivisiveis = numeros.stream()
                 .filter(n -> n % 3 == 0 && n % 5 == 0)
                 .reduce(0, Integer::sum);  

        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + somaDivisiveis);
    }
}
