package screens;

import screens.androidScreen.*;


public class Screens {

    public Screens() {
    }

    private CategoriesScreen categoriesScreen;
    private AllCategoriesScreen allCategoriesScreen;
    private KitapYurdu kitapYurdu;
    private Puzzle_Yapboz_Screen puzzle_yapboz_screen;
    private KitapCategories kitapCategories;

    private VariousScreen variousScreen;
    private KirtasiyeScreens kirtasiyeScreens;
    private CDScreen cdScreen;

    public CDScreen cdScreen() {
        if (cdScreen == null) {
            cdScreen = new CDScreen();
        }return cdScreen;
    }


    public VariousScreen variousScreen(){
        if(variousScreen==null){
            variousScreen=new VariousScreen();
        }return variousScreen;
    }


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


public KitapCategories kitapCategories(){
        if (this.kitapCategories ==null){
            this.kitapCategories = new KitapCategories();
        }
        return  this.kitapCategories;
}

    public KirtasiyeScreens kirtasiyeScreens() {
        if (this.kirtasiyeScreens == null) {
            this.kirtasiyeScreens = new KirtasiyeScreens();
        }
        return this.kirtasiyeScreens;
    }




}
