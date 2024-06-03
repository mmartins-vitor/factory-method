

public class EmissorSincronoCreator extends EmissorCreator {

    public Emissor create(int tipoDeEmissor) {

        if (tipoDeEmissor == EmissorCreator.SMS) {

            return new EmissorSincronoSMS();
        } else if (tipoDeEmissor == EmissorCreator.EMAIL) {
            return new EmissorSincronoEMAIL();
        } else if (tipoDeEmissor == EmissorCreator.JSM) {
            return new EmissorSincronoJSM();
        } else {
            throw new IllegalArgumentException("Tipo de Emissor não suportador");
        }
    }
}
