package Models;/*Essa classe representa as possíveis categorias de sócios estabelecidas pelo
        clube. Seu único atributo é a descrição da categoria.*/

import java.util.List;

public class Categoria {

    private String des_cat; //Descrição da Models.Categoria
    private List<Socio> socios;

    public Categoria(String descricao){
        des_cat = descricao;
    }
}
