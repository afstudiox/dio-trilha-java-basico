import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Integer> numeros;

    //construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if(!numeros.isEmpty()){
                System.out.println(this.numeros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(50);

        // Exibindo a lista de números
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Exibindo o menor número
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());

        // Exibindo o maior número
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
    }


}


