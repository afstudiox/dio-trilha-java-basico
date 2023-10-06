import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long id, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(id, nome, preco, quantidade));
    }

    public Set<Produto> exibiProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibiProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "Produto 01", 100.0, 10);
        cadastroProdutos.adicionarProduto(2, "Produto 02", 20.0, 20);
        cadastroProdutos.adicionarProduto(3, "Produto 03", 300.0, 30);
        cadastroProdutos.adicionarProduto(4, "Produto 04", 40.0, 40);
        cadastroProdutos.adicionarProduto(5, "Produto 05", 500.0, 50);
        cadastroProdutos.adicionarProduto(6, "Produto 06", 60.0, 60);
        cadastroProdutos.adicionarProduto(7, "Produto 07", 700.0, 70);
        cadastroProdutos.adicionarProduto(8, "Produto 08", 80.0, 80);
        cadastroProdutos.adicionarProduto(9, "Produto 09", 900.0, 90);
        cadastroProdutos.adicionarProduto(10, "Produto 10", 100.0, 100);

        System.out.println("Produtos por nome:");
        for (Produto produto : cadastroProdutos.exibiProdutosPorNome()) {
            System.out.println(produto);
        }

        System.out.println("\nProdutos por preço:");
        for (Produto produto : cadastroProdutos.exibiProdutosPorPreco()) {
            System.out.println(produto);
        }
    }

    
}
