public class FabricaSMSConfirmacao implements FabricaConfirmacao {
    private String numero;

    public FabricaSMSConfirmacao(String numero) {
        this.numero = numero;
    }

    @Override
    public MensagemConfirmacao criarMensagemConfirmacao() {
        return new SMSConfirmacao(numero);
    }
}