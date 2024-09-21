import Ex1.EstoqueProdutos;
import Ex1.ItemPedido;
import Ex1.Pedido;
import Ex1.Produto;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos(null, 0);
        estoque.carregarProdutos();



        System.out.println("---------------------Estoque-----------------------");
        System.out.println(estoque.verEstoque());
        System.out.println("----------------------------------------------------");






        Produto produto1 = new Produto(1, 23.0, "Limpeza");
        Produto produto2 = new Produto(2, 1543.0, "Tecnologia");
        Produto produto3 = new Produto(3, 55.99, "Alimento");
        Produto produto4 = new Produto(4, 16.50, "Home");



        Pedido pedido = new Pedido();
        ItemPedido item1 = new ItemPedido(2, produto1);
        ItemPedido item2 = new ItemPedido(5, produto2);
        ItemPedido item3 = new ItemPedido(2, produto3);
        ItemPedido item4 = new ItemPedido(3, produto4);



        pedido.adicionarItem(item1, estoque);
        pedido.adicionarItem(item2, estoque);
        pedido.adicionarItem(item3, estoque);
        pedido.adicionarItem(item4, estoque);




        System.out.println("---------Cupom Fiscal--------");
        pedido.cupomFiscal();
        System.out.println("------------------------------");


        System.out.println("-----------------------Estoque-----------------------------");
        System.out.println(estoque.verEstoque());
        System.out.println("-----------------------------------------------------------");

    }
}