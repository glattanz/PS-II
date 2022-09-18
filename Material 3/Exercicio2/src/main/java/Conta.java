public class Conta {

    public double saldo;
    public Estado estado;

    public Conta(double saldo) {
        this.saldo = saldo;
        this.estado = new Positiva();
    }

    //Métodos gancho
    //Não tem a lógica propiamente dita, a lógica está nas classes de estado
    public void sacar(double valor){
        this.estado.sacar(valor, this);
    }

    public void depositar(double valor) {

        this.estado.depositar(valor, this);
    }

    public double getSaldo() {
        return saldo;
    }

}