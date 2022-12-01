import java.util.List;

public interface Item {

    public abstract void adicionar(Item g);

    public abstract void remover(Item g);

    public abstract List<Item> getFilhos();

    public abstract Double getPreco();

}
