package list.basico;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // atributo
    private List<Tarefa> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefasList.add(new Tarefa(descricao));
    }    
    
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for( Tarefa tarefa : tarefasList){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefasList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Estudar Java");
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Estudar Angular");
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Estudar Angular");
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("Estudar Angular");
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricaoTarefas();
    }
}
