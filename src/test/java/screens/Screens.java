package screens;

import screens.androidScreen.*;

public class Screens {
    public Screens(){
    }

    private CategoriesScreen categoriesScreen;
    private AllCategoriesScreen allCategoriesScreen;

    public AllCategoriesScreen allCategoriesScreen(){
        if(allCategoriesScreen==null){
            allCategoriesScreen=new AllCategoriesScreen();
        }return allCategoriesScreen;
    }

    public CategoriesScreen categoriesScreen(){
        if(categoriesScreen== null){
            categoriesScreen=new CategoriesScreen();
        } return categoriesScreen;
    }



}
