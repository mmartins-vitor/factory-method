

public class EmissorAssincronoEMAIL implements Emissor{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviado por Assincrono EMAIL: ");
        System.out.println(mensagem);
    }

}
