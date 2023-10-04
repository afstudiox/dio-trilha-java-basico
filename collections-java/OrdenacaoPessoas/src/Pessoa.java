import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    //atributos
    private String nome;
    private int idade;
    private double altura;

    
    //construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    
    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }

    //getters e setters
    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public double getAltura() {
        return altura;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return  nome + " - " + idade + " anos" + " - " + altura + "m" ;
    }
 
    
}


class comparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
