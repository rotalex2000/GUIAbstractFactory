package factories;

import buttons.Button;
import buttons.ClassicButton;
import windows.ClassicWindow;
import windows.Window;

public class ClassicFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new ClassicButton();
    }

    @Override
    public Window createWindow() {
        return new ClassicWindow();
    }
}
