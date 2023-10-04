import java.util.ArrayList;
import java.util.List;
import utils.FormatarPreco;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<Item>();
    }
    
    public void adicionaItem(String nome, int quantidade, double preco) {
        Item item = new Item(nome, quantidade, preco);
        this.itensList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : this.itensList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        this.itensList.removeAll(itensParaRemover);
    }

    public Double calcularValorTotal() {
        Double valorTotal = 0.0;
        for (Item item : this.itensList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println("Carrinho de Compras");
          for (Item item : this.itensList) {
            System.out.println(item);
        }
        System.out.println("Valor total: $ " + FormatarPreco.formatar(this.calcularValorTotal()) + "\n");
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaItem("Arroz", 2, 10.0);
        carrinho.adicionaItem("Feijão", 1, 12.0);
        carrinho.adicionaItem("Macarrão", 3, 8.0);
        carrinho.exibirItens();
        carrinho.removerItem("Arroz");
        carrinho.exibirItens();
    }

}
