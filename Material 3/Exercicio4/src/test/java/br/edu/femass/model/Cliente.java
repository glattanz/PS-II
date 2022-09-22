package br.edu.femass.model;

import br.edu.femass.model.locacao.Agendada;
import br.edu.femass.model.locacao.Locacao;
import br.edu.femass.model.pagamento.EstadoPgto;
import br.edu.femass.model.pagamento.Pagamento;
import br.edu.femass.model.pagamento.PgtoPendente;

import java.time.LocalDate;

public class Cliente {

    String nome;
    String CPF;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.CPF = cpf;
    }

    void reservarVeiculo(){

        Locacao locacao = new Locacao();
        locacao.estado = new Agendada();

        Pagamento pagamento = new Pagamento();
        pagamento.estado = EstadoPgto.PENDENTE;
    }

    void realizarPgto(){

    }

}
