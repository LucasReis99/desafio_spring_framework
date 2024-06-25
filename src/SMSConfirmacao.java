public class SMSConfirmacao implements MensagemConfirmacao {
    private String numero;

    public SMSConfirmacao(String numero) {
        this.numero = numero;
    }

    @Override
    public void enviar() {
        System.out.println("SMS de confirmação enviado para " + numero);
    }
}