import java.util.ArrayList;
import java.util.List;

public class Caixa implements Item {

    public Double preco = 0D;

    private List<Item> filhos = new ArrayList<Item>();

    public void adicionar(Item g){
        filhos.add(g);
    }

    public void remover(Item g){
        filhos.remove(g);
    }

    public List<Item> getFilhos(){
        return filhos;
    }

    @Override
    public Double getPreco(){
        for(Item item : filhos){
            preco += item.getPreco();
        }
        return preco;
    }
}
