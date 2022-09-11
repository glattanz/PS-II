public class Negativa extends Estado{

    public Negativa() {

    }

    @Override
    public void sacar(double valor, Conta c) {
        System.out.println("-Negativa-");

        if(c.saldo <= -100){

            c.estado = new Bloqueada();
        }else{
            //Pode sacar na conta negativa?
            c.saldo -= valor;
            System.out.println("Saque realizado!");
        }
    }

    @Override
    public void depositar(double valor, Conta c) {
        System.out.println("-Negativa-");

        c.saldo =+ valor;

        if(c.saldo >= 0){
            c.estado = new Positiva();
        }

        System.out.println("Depósito realizado!");
    }

}
