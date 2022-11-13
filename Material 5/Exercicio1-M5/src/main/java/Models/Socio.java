package Models;/*Essa classe armazena as informações referentes aos sócios do clube. Os
atributos dessa classe são autoexplicativos. A classe tem dois métodos, um
para registrar um sócio e outro para consultar um sócio específico.
O método regSocio retorna um long que representa o número do cartão
do sócio, e o método consSocio retorna uma String contendo os dados de
um determinado cliente. Observe que um sócio pertence a uma categoria,
mas uma categoria pode estar associada a muitos sócios.*/

import java.util.List;

public class Socio {

    private long cartao_socio;
    private String nome_socio;
    private String end_socio;
    private String tel_socio;
    private String email_socio;
    private Categoria cat_socio;
    private List<Dependente> dependentes;
    private long ultimoCartao = 200123000L;

    public long regSocio(String nome, String end, String tel, String email, Categoria categoria){ //Registrar sócio

        nome_socio = nome;
        tel_socio = tel;
        email_socio = email;
        cat_socio = categoria;
        cartao_socio = gerarNumCartao();

        return cartao_socio; //Retorna o número do cartão do sócio
    }

    public String consSocio(long cartao_socio){ //Consultar sócio



        return ""; //Retorna os dados de um sócio
    }

    private long gerarNumCartao(){

        long novoNum = ultimoCartao++;

        return novoNum;
    }
}
