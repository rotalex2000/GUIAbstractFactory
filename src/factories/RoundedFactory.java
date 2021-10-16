package factories;

import buttons.Button;
import buttons.RoundedButton;
import windows.RoundedWindow;
import windows.Window;

public class RoundedFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new RoundedButton();
    }

    @Override
    public Window createWindow() {
        return new RoundedWindow();
    }
}
