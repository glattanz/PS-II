public class Positiva extends Estado{

    public Positiva() {

    }

    //Pode ser publico o método?
    public void sacar(double valor, Conta c) {
        System.out.println("-Positiva-");

        if((c.saldo - valor) >= -100) {

            if((c.saldo - valor) < 0)
            c.estado = new Negativa();

            c.saldo -= valor;

            System.out.println("Saque realizado!");
        }else{
            System.out.println("Saque não permitido!");
        }

    }

    @Override
    public void depositar(double valor, Conta c) {
        System.out.println("-Positiva-");

        c.saldo =+ valor;

        System.out.println("Depósito realizado!");
    }

    public String getEstado(Conta c){
        return "Positiva";
    }
}