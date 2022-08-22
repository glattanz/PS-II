public class main {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

        pf.setRG(12345567);
        pf.setNome("Fulano");
        pf.setRendaBruta(2999.0);
        pf.calcularIR();




    }


}
