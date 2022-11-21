import java.util.List;

public abstract class Graphic {

    public abstract void adicionar(Graphic g);

    public abstract void remover(Graphic g);

    public abstract List<Graphic> getFolhas();

    public abstract void imprime();
}
