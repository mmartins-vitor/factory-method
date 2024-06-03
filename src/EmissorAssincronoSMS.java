

public class EmissorAssincronoSMS implements Emissor{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviado por Assincrono SMS: ");
        System.out.println(mensagem);
    }

}
