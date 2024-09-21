package Ex1;

import java.util.ArrayList;
import java.util.List;

public class EstoqueProdutos implements Estoque {
    private List<EstoqueProdutos> estoque = new ArrayList<>();
    private Produto produto;
    private int quantidade;

    public EstoqueProdutos(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public boolean removerProduto(Produto produto, int quantidade) {
        for (EstoqueProdutos ep : estoque) {
            if (ep.produto.getCodigo() == produto.getCodigo() && ep.quantidade >= quantidade) {
                ep.quantidade -= quantidade;
                return true;
            }
        }
        return false;
    }

    public void carregarProdutos() {
        Produto p1 = new Produto(1, 23.0, "Limpeza");
        Produto p2 = new Produto(2, 1543.0, "Eletrônico");
        Produto p3 = new Produto(3,55.99,"ALimento");
        Produto p4 = new Produto(4,16.50,"Home");

        estoque.add(new EstoqueProdutos(p1, 100));
        estoque.add(new EstoqueProdutos(p2, 100));
        estoque.add(new EstoqueProdutos(p3, 100));
        estoque.add(new EstoqueProdutos(p4, 100));
    }

    public String verEstoque() {
        StringBuilder sb = new StringBuilder();
        for (EstoqueProdutos ep : estoque) {
            sb.append("[produto=").append(ep.produto.toString())
                    .append(", quantidade=").append(ep.quantidade).append("]\n");
        }
        return sb.toString();
    }
}