package br.edu.femass.model.locacao;

public class Locacao {

    public EstadoLocacao estado;

    public Locacao(){
        this.estadoLocacao = new Agendada();
    }

    public void locarVeiculo(){
        this.estadoLocacao = new EmAndamento();
    }
}
