

public class EmissorAssincronoCreator extends EmissorCreator {

    public Emissor create(int tipoDeEmissor) {

        if (tipoDeEmissor == EmissorCreator.SMS) {

            return new EmissorAssincronoSMS();
        } else if (tipoDeEmissor == EmissorCreator.EMAIL) {
            return new EmissorAssincronoEMAIL();
        } else if (tipoDeEmissor == EmissorCreator.JSM) {
            return new EmissorAssincronoJSM();
        } else {
            throw new IllegalArgumentException("Tipo de Emissor não suportador");
        }
    }
}
