package screens;

import screens.androidScreen.*;


public class Screens {

    public Screens(){
    }

    private CategoriesScreen categoriesScreen;
    private AllCategoriesScreen allCategoriesScreen;
    private KitapYurdu kitapYurdu;
    private Puzzle_Yapboz_Screen puzzle_yapboz_screen;
    private KitapYurduKirtasiye kitapYurduKirtasiye;

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


    public KitapYurdu kitapYurdu() {
        if (this.kitapYurdu == null) {
            this.kitapYurdu = new KitapYurdu();
        }

        return this.kitapYurdu;
    }

    public Puzzle_Yapboz_Screen puzzle_yapboz_screen() {
        if (this.puzzle_yapboz_screen == null) {
            this.puzzle_yapboz_screen = new Puzzle_Yapboz_Screen();
        }

        return this.puzzle_yapboz_screen;
    }

    public KitapYurduKirtasiye kitapYurduKirtasiye() {
        if (this.kitapYurduKirtasiye == null) {
            this.kitapYurduKirtasiye = new KitapYurduKirtasiye();
        }
        return this.kitapYurduKirtasiye;
    }



}
