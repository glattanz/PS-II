//Classe abstrata
public abstract class Pessoa {

    //Atributos
    protected String nome;
    protected Double rendaBruta;

    //Método abstrato
    public abstract Double calcularIR();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(Double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

}
