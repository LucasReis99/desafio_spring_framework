public class PedidoProduto implements Pedido {
    private String produto;

    public PedidoProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public void confirmar() {
        System.out.println("Pedido do produto '" + produto + "' confirmado.");
    }
}