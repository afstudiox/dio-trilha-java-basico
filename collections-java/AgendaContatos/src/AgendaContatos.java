import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        for (Contato contato : contatoSet) {
            System.out.println(contato);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().contains(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, String novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato : contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setTelefone(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();
        
        agenda.adicionarContato("João Bosco", "1234-5678");
        agenda.adicionarContato("Maria", "1234-5678");
        agenda.adicionarContato("José", "1234-5678");
        agenda.adicionarContato("João Jão", "1234-5678");
        agenda.adicionarContato("Maria", "1234-5678");
        agenda.adicionarContato("José", "1234-5678");
        
        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("João"));

        agenda.atualizarNumeroContato("João Bosco", "9999-9999");

        agenda.exibirContatos();

    }



}
