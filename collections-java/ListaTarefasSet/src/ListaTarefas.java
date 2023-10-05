import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
    this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        this.tarefasSet.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public void exibirTarefas() {
        System.out.println("Lista de tarefas - " + this.contarTarefas() + " tarefas");
        this.tarefasSet.forEach(tarefa -> System.out.println(tarefa));
    }

    public int contarTarefas() {
        return this.tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        this.tarefasSet.forEach(tarefa -> {
            if (tarefa.isFeita()){
                tarefasConcluidas.add(tarefa);
            }
        });
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        this.tarefasSet.forEach(tarefa -> {
            if (!tarefa.isFeita()){
                tarefasPendentes.add(tarefa);
            }
        });
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        this.tarefasSet.forEach(tarefa -> {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setFeita(true);
            }
        });
    }

    public void marcarTarefaPendente(String descricao){
        this.tarefasSet.forEach(tarefa -> {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setFeita(false);
            }
        });
    }

    public void limparListaTarefas(){
        this.tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar C#");
        listaTarefas.adicionarTarefa("Estudar C++");
        listaTarefas.adicionarTarefa("Estudar Angular");

        System.out.println("\n");
        listaTarefas.exibirTarefas();
        System.out.println("\n");

        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Estudar Angular");
        listaTarefas.marcarTarefaConcluida("Estudar C++");

        listaTarefas.exibirTarefas();
        System.out.println("\n");

        listaTarefas.marcarTarefaPendente("Estudar Java");

        listaTarefas.exibirTarefas();
        System.out.println("\n");
        
        listaTarefas.removerTarefa("Estudar C++");
        
        listaTarefas.exibirTarefas();
        System.out.println("\n");
        
        
        System.out.println("Tarefas concluídas - " 
        + listaTarefas.obterTarefasConcluidas().size() + " tarefas");
        for(Tarefa tarefa : listaTarefas.obterTarefasConcluidas()){
            System.out.println(tarefa);
        }
        System.out.println("\n");
        
        System.out.println("Tarefas Pendentes - " 
        + listaTarefas.obterTarefasPendentes().size() + " tarefas");
        for(Tarefa tarefa : listaTarefas.obterTarefasPendentes()){
            System.out.println(tarefa);
        }
        System.out.println("\n");
        
        System.out.println("Limpando a lista de tarefas");
        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();
        System.out.println("\n");

    }
    
}
