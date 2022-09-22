package br.edu.femass.model.veiculo;

public class Veiculo {

    private String cor;
    private String placa;
    private int qntLugares;
    private Double quilometragem;
    public EstadoVeiculo estado;


    public Veiculo(){

    }

    public Veiculo(String cor, String placa, int qntLugares, Double quilometragem){
        this.cor = cor;
        this.placa = placa;
        this.qntLugares = qntLugares;
        this.quilometragem = quilometragem;
    }

}
