package br.edu.femass.model.locacao;

import br.edu.femass.model.pagamento.Pagamento;
import br.edu.femass.model.pagamento.PgtoPendente;
import br.edu.femass.model.veiculo.Veiculo;

import java.time.LocalDate;

public class Agendada extends EstadoLocacao{

    LocalDate dataPrevista;

    public Agendada(){
        PgtoPendente pgto = new PgtoPendente();
        this.dataPrevista = LocalDate.of(2022, 9, 19);
        //veiculo.estado = new
    }


}
