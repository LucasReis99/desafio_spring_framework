public class Cliente {
    public static void main(String[] args) {
        // Cliente faz um pedido de um produto específico
        Pedido pedido = new PedidoProduto("Celular");

        // Cliente escolhe a fábrica de confirmação por Email
        FabricaConfirmacao fabricaEmail = new FabricaEmailConfirmacao("cliente@email.com");
        MensagemConfirmacao emailConfirmacao = fabricaEmail.criarMensagemConfirmacao();

        // Cliente confirma o pedido usando o método de confirmação por Email
        pedido.confirmar();
        emailConfirmacao.enviar();

        // Cliente escolhe a fábrica de confirmação por SMS
        FabricaConfirmacao fabricaSMS = new FabricaSMSConfirmacao("+123456789");
        MensagemConfirmacao smsConfirmacao = fabricaSMS.criarMensagemConfirmacao();

        // Cliente confirma o pedido usando o método de confirmação por SMS
        pedido.confirmar();
        smsConfirmacao.enviar();
    }
}