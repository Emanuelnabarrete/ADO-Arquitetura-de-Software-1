package Ex1;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private double valorTotal = 0.0;

    public void adicionarItem(ItemPedido item, EstoqueProdutos estoque) {
        if (estoque.removerProduto(item.getProduto(), item.getQuantidade())) {
            itens.add(item);
            valorTotal += item.getProduto().getPreco() * item.getQuantidade();
        } else {
            System.out.println("Produto indisponível no estoque.");
        }
    }

    public double calcularTotal() {
        return valorTotal;
    }

    public void cupomFiscal() {

        for (ItemPedido item : itens) {
            System.out.println("Produto: " + item.getProduto().getCodigo() +
                    ",preco=" + item.getProduto().getPreco() +
                    ",categoria=" + item.getProduto().getCategoria() +
                    ",quantidade=" + item.getQuantidade());
        }
        System.out.println("Total do pedido=" + valorTotal);
    }
}