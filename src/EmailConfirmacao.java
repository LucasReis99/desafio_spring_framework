public class EmailConfirmacao implements MensagemConfirmacao {
    private String email;

    public EmailConfirmacao(String email) {
        this.email = email;
    }

    @Override
    public void enviar() {
        System.out.println("Email de confirmação enviado para " + email);
    }
}
