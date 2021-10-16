package factories;

import buttons.Button;
import buttons.HighlightedButton;
import windows.HighlightedWindow;
import windows.Window;

public class HighlightedFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new HighlightedButton();
    }

    @Override
    public Window createWindow() {
        return new HighlightedWindow();
    }
}
