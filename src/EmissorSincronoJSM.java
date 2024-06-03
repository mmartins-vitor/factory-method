

public class EmissorSincronoJSM implements Emissor{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviado por Sincrono JSM: ");
        System.out.println(mensagem);
    }

}
