package Controllers;

import Views.SocioView;

public class SocioController {

    public ArrayList<SocioView> view = new ArrayList<>();
    public Model model;

    public Controller(){
        this.model = new Model();
        this.view.add(new View(this));
    }
}
