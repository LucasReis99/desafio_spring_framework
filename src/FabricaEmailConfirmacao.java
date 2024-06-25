public class FabricaEmailConfirmacao implements FabricaConfirmacao {
    private String email;

    public FabricaEmailConfirmacao(String email) {
        this.email = email;
    }

    @Override
    public MensagemConfirmacao criarMensagemConfirmacao() {
        return new EmailConfirmacao(email);
    }
}