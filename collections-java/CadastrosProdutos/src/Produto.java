import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public int getQuantidade() {
        return quantidade;
    }


    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto produto) {
        return this.nome.compareToIgnoreCase(produto.getNome());
        
    }
    
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
    
}
