public class PessoaJuridica extends Pessoa{

    private int CNPJ;

    public Double calcularIR(){

        Double ir = 0.0;

        if(this.rendaBruta <= 30000){
            ir = this.rendaBruta * 0.0;
        }else if(this.rendaBruta > 30000 && this.rendaBruta <= 50000){
            ir = this.rendaBruta * 0.01;
        }else if(this.rendaBruta > 50000 && this.rendaBruta <= 90000){
            ir = this.rendaBruta * 0.02;
        }else if(this.rendaBruta > 90000){
            ir = this.rendaBruta * 0.027;
        }

        return ir;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

}
