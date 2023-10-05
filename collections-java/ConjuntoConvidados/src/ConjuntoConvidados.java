import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
        System.out.println("Convidado " + nome + " adicionado com sucesso!");
    }

    public void removerConvidado(int codigoConvite) {
        this.convidadoSet.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
        System.out.println("Convidado com o convite " + codigoConvite + " removido com sucesso!");
    }

    public int contarConvidados() {
        return this.convidadoSet.size();
    }

    public void exibirListaConvidados() {
        System.out.println("\nLista de convidados - Quantidade( " + this.contarConvidados() + " )\n");
        this.convidadoSet.forEach(convidado -> System.out.println(convidado));
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        

        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("José", 3);
        conjuntoConvidados.adicionarConvidado("Ana", 4);

        conjuntoConvidados.exibirListaConvidados();

        conjuntoConvidados.removerConvidado(2);

        conjuntoConvidados.exibirListaConvidados();
    }
}


