package screens;
import screens.androidScreen.ApiDemosScreen;
import screens.androidScreen.DateWidgetsScreen;
import screens.androidScreen.DragAndDropScreen;
import screens.androidScreen.KitapYurdu;
import screens.androidScreen.MainScreen;
import screens.androidScreen.PreferenceDependenciesScreen;
import screens.androidScreen.PreferenceScreen;
import screens.androidScreen.Puzzle_Yapboz_Screen;
import screens.androidScreen.SwitchScreen;
import screens.androidScreen.ViewsScreen;

public class Screens {

    private KitapYurdu kitapYurdu;
    private Puzzle_Yapboz_Screen puzzle_yapboz_screen;

    public Screens() {
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


}
