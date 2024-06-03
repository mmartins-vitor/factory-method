

public class App {
    public static void main(String[] args) throws Exception {
        
        EmissorCreator creator = new EmissorAssincronoCreator();
        
        Emissor emissor = creator.create(EmissorCreator.EMAIL);
        emissor.enviar("Factory Method");
        System.out.println();






    }
}
