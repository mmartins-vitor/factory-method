

public class EmissorSincronoSMS implements Emissor{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviado por Sincrono SMS: ");
        System.out.println(mensagem);
    }

}
