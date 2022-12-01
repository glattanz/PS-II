import java.util.List;

public class Produto implements Item {

    public Double preco = 0D;

    public void adicionar(Item g){

    }

    public void remover(Item g){

    }

    public List<Item> getFilhos(){
        return null;
    }

    public Produto(Double preco){
        this.preco = preco;
    }

    @Override
    public Double getPreco(){
        return preco;
    }
}
