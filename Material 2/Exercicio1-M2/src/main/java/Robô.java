public class Robô implements Controle{

    @Override
    public void andar(){
        System.out.println("Andando...");
    }

    @Override
    public void virar(){
        System.out.println("Virando...");
    }

    @Override
    public void falar(){
        System.out.println("Falando...");
    }
}
