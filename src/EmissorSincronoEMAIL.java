

public class EmissorSincronoEMAIL implements Emissor{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviado por Sincrono EMAIL: ");
        System.out.println(mensagem);
    }

}
