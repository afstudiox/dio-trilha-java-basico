import java.util.Set;
import java.util.TreeSet;

public class ListaAlunos {
    Set<Aluno> alunoSet;

    public ListaAlunos() {
        alunoSet = new TreeSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }


    public void removerAluno(long matricula){
        for (Aluno aluno : alunoSet) {
            if (aluno.getMatricula() == matricula) {
                alunoSet.remove(aluno);
                System.out.println("Aluno " + aluno.getNome() + " removido com sucesso!\n");
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunos() {
        return alunoSet;
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome =  new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota =  new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public static void main(String[] args) {
        ListaAlunos listaAlunos = new ListaAlunos();
        listaAlunos.adicionarAluno("João", 123456L, 8.5);
        listaAlunos.adicionarAluno("Maria", 123457L, 9.5);
        listaAlunos.adicionarAluno("José", 123458L, 7.5);
        listaAlunos.adicionarAluno("Ana", 123459L, 6.5);
        listaAlunos.adicionarAluno("Pedro", 123460L, 5.5);
        listaAlunos.adicionarAluno("Paulo", 123461L, 4.5);
        listaAlunos.adicionarAluno("Carlos", 123462L, 3.5);
        listaAlunos.adicionarAluno("Marta", 123463L, 2.5);
        listaAlunos.adicionarAluno("Mariana", 123464L, 1.5);
        listaAlunos.adicionarAluno("Mário", 123465L, 0.5);
       
        System.out.println("Lista de alunos:");
        for (Aluno aluno : listaAlunos.exibirAlunos()) {
            System.out.println(aluno);
        }
        System.out.println("\n");
        
        System.out.println("Lista de alunos por nome:");
        for (Aluno aluno : listaAlunos.exibirAlunosPorNome()) {
            System.out.println(aluno);
        }
        System.out.println("\n");
        
        System.out.println("Lista de alunos por nota:");
        for (Aluno aluno : listaAlunos.exibirAlunosPorNota()) {
            System.out.println(aluno);
        }
        System.out.println("\n");
    
        listaAlunos.removerAluno(123460L);
    }
    
}
