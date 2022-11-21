import java.util.List;

public class Rectangle extends Graphic{

    @Override
    public void adicionar(Graphic g){
    }

    @Override
    public void remover(Graphic g){
    }

    @Override
    public List<Graphic> getFolhas(){
        return null;
    }

    @Override
    public void imprime(){
        System.out.println("Rectangle.");
    }
}
