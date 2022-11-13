package Models;/*A classe em questão representa as mensalidades que devem ser pagas por
cada sócio. Seus atributos são data da mensalidade e data em que a men-
salidade foi efetivamente paga, do tipo Date, valor da mensalidade, juros
da mensalidade e o valor efetivamente pago do tipo double, e um atributo
denominado quit mens do tipo boolean, que determina se a mensalidade
foi quitada ou não.*/

import java.time.LocalDate;

public class Mensalidade {

    private LocalDate data_mens;
    private double valor_mens;
    private LocalDate data_pgto_mens;
    private double juros_mens;
    private double valor_pago;
    private boolean quit_mens; //Se pagou a mensalidade ou não

    public Mensalidade(){

    }

    //É disparado para consultar cada mensalidade ainda não paga de um
    //determinado sócio. Retorna uma String com os dados da mensalidade.
    public String consMens(){

        return "";
    }

    //Calcula os juros de uma mensalidade, no caso de esta estar atrasada.
    //Retorna um double contendo o valor atual, após a aplicação de juros,
    //da mensalidade.
    public double calcJuros(){

        double valorJuros = this.valor_mens * (0.05 * (LocalDate.now().getMonthValue() - this.data_mens.getMonthValue()));
        double novoValor = this.valor_mens + valorJuros;

        if (data_pgto_mens == null){
            System.out.println("Valor do juros: R$ " + valorJuros);
            System.out.println("Novo valor da mensalidade: R$ " + novoValor);

            return novoValor;
        }else {
            System.out.println("Não há mensalidade atrasada.");

            return 0D;
        }
    }

    //Permite a quitação de uma mensalidade, retornando verdadeiro, se a
    //operação foi concluída com sucesso, ou falso, se ocorreu algum problema
    //quando se tentou quitar a mensalidade
    public boolean quitarMens(){

        if(this.data_pgto_mens == null){

            this.data_pgto_mens = LocalDate.now();
            this.valor_pago = this.valor_mens;

            System.out.println("Foi pago o valor de: R$ " + this.valor_mens);

            return true;

        }else{
            System.out.println("Não há mensalidades para quitar.");

            return false;
        }
    }
}
