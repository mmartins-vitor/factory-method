

public class EmissorAssincronoJSM implements Emissor{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviado por Assincrono JSM: ");
        System.out.println(mensagem);
    }

}
