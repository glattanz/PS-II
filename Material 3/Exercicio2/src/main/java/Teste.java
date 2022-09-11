public class Teste {

    public static void main(String[] args) {

        Conta c1 = new Conta(1200);
        c1.depositar(1000);
        System.out.println(c1.getSaldo());
        System.out.println(c1.getEstado());

        c1.sacar(20);
        System.out.println(c1.getSaldo());
        //System.out.println(c1.getEstado());

        c1.sacar(1000);
        System.out.println(c1.getSaldo());
        //System.out.println(c1.getEstado());

        c1.sacar(100);
        System.out.println(c1.getSaldo());
        //System.out.println(c1.getEstado());

        c1.sacar(10);
        System.out.println(c1.getSaldo());
        //System.out.println(c1.getEstado());

        c1.sacar(100);
        System.out.println(c1.getSaldo());
        //System.out.println(c1.getEstado());

        c1.depositar(1000);
        System.out.println(c1.getSaldo());
        //System.out.println(c1.getEstado());
    }

}