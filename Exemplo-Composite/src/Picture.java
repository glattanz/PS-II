import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic{

    private List<Graphic> folhas = new ArrayList<Graphic>();

    @Override
    public void adicionar(Graphic g){
        folhas.add(g);
    }

    @Override
    public void remover(Graphic g){
        folhas.remove(g);
    }

    @Override
    public List<Graphic> getFolhas(){
        return folhas;
    }

    @Override
    public void imprime(){
        for(Graphic graphic : folhas){
            graphic.imprime();
        }
    }
}
