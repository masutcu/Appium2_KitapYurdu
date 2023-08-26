package screens;

import screens.androidScreen.*;

public class Screens {
    public Screens(){
    }
    private KitapYurduKirtasiye kitapYurduKirtasiye;

    public KitapYurduKirtasiye kitapYurduKirtasiye(){
        if (kitapYurduKirtasiye == null){
            kitapYurduKirtasiye = new KitapYurduKirtasiye();
        }
        return kitapYurduKirtasiye;
    }

}
