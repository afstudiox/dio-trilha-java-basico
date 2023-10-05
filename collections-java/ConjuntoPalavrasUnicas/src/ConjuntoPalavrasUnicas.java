import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // atributos
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        this.palavrasUnicasSet.remove(palavra);
        System.out.println("A palavra " + palavra + " foi removida do conjunto.");
    }

    public void verificarPalavra(String palavra) {
        if (this.palavrasUnicasSet.contains(palavra)) {
            System.out.println("A palavra " + palavra + " está no conjunto.");
        } else {
            System.out.println("A palavra " + palavra + " não está no conjunto.");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println("Palavras únicas: " + this.palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("casa");
        conjuntoPalavrasUnicas.adicionarPalavra("casa");
        conjuntoPalavrasUnicas.adicionarPalavra("carro");
        conjuntoPalavrasUnicas.adicionarPalavra("chapeu");
        conjuntoPalavrasUnicas.adicionarPalavra("sapato");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("casa");

        conjuntoPalavrasUnicas.removerPalavra("casa");

        conjuntoPalavrasUnicas.verificarPalavra("casa");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }

}
