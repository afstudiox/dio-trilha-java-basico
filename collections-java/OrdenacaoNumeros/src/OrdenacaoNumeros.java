import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos
    private List<Integer> numerosList;

    //construtor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    // adiciona numero
    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendent() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> exibirNumeros() {
        if(!numerosList.isEmpty()){
            return numerosList;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(3);
        
  
        
        System.out.print(numeros.exibirNumeros() +" <<-- Ordenação Natural\n");
        System.out.println(numeros.ordenarAscendent() + " <<-- Ordenação ascendente");
        System.out.println(numeros.ordenarDescendente() + " <<-- Ordenação descendente");
    }



    
}
