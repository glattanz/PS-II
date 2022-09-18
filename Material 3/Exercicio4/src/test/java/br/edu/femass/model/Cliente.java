package br.edu.femass.model;

import br.edu.femass.model.locacao.Locacao;

import java.time.LocalDate;

public class Cliente {

    String nome;
    String CPF;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.CPF = cpf;
    }

    void locarVeiculo(){
        Locacao locacao = new Locacao();

    }

    void realizarPgto(){

    }

}
