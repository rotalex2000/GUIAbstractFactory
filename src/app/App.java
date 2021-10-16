package app;

import buttons.Button;
import factories.GUIFactory;
import windows.Window;

public class App {

    private Button button;
    private Window window;

    public App(GUIFactory factory) {
        button = factory.createButton();
        window = factory.createWindow();
    }

    public void draw() {
        button.draw();
        window.draw();
    }
}
