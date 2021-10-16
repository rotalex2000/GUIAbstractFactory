package buttons;

import utils.TextStyle;

public interface Button {
    void setBorderRadius(float radius);
    void setTextStyle(TextStyle textStyle);
    void draw();
}