public class PessoaFisica extends Pessoa {

    private int RG;

    public Double calcularIR(){

        Double ir = 0.0;

        if(this.rendaBruta <= 1500){
            ir = this.rendaBruta * 0.0;
        }else if(this.rendaBruta > 1500 && this.rendaBruta <= 3000){
            ir = this.rendaBruta * 0.01;
        }else if(this.rendaBruta > 3000 && this.rendaBruta <= 10000){
            ir = this.rendaBruta * 0.02;
        }else if(this.rendaBruta > 10000){
            ir = this.rendaBruta * 0.027;
        }

        return ir;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }
}
