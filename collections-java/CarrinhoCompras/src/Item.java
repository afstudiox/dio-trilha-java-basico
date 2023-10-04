import utils.FormatarPreco;

public class Item {
    //atributos
    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }


    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    // override toString
    @Override
    public String toString() {
        String item =  this.nome + " | " + this.quantidade + " unid | " + "$ " + FormatarPreco.formatar(this.preco);
        return item;
    }
}
