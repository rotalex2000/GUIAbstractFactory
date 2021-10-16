package factories;

import buttons.Button;
import windows.Window;

public interface GUIFactory {
    Button createButton();
    Window createWindow();
}