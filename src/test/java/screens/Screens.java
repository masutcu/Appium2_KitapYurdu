package screens;

import screens.androidScreen.*;

public class Screens {
    public Screens(){
    }

    private CategoriesScreen categoriesScreen;
    public CategoriesScreen categoriesScreen(){
        if(categoriesScreen== null){
            categoriesScreen=new CategoriesScreen();
        } return categoriesScreen;
    }



}
