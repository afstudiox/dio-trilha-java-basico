public class Tarefa {
    private String descricao;
    private boolean feita;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.feita = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", feita=" + feita + "]";
    }


    
}
