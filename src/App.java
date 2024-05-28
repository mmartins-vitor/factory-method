public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.

        //Emissor emissor = new EmissorSMS();
        //emissor.enviar("Treinamento Factory Method");

        //Emissor emissor = new EmissorSMS();
        //emissor.enviar("Treinamento Factory Method");

        Emissor emissor = new EmissorJSM();
        emissor.enviar("Treinamento Factory Method");



    }
}
