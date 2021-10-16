import app.App;
import factories.ClassicFactory;
import factories.GUIFactory;
import factories.HighlightedFactory;
import factories.RoundedFactory;
import theme.Theme;

public class Demo {

    private static App configureApp() {

        App app;
        GUIFactory factory;
        Theme theme = Theme.ROUNDED; // I hardcoded it, but it could be generated somehow

        switch (theme) {
            case ROUNDED:
                factory = new RoundedFactory();
                break;
            case HIGHLIGHTED:
                factory = new HighlightedFactory();
                break;
            default:
                factory = new ClassicFactory();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
        App app = configureApp();
        app.draw();
    }
}
