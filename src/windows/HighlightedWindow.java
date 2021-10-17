package windows;

import utils.TextStyle;

public class HighlightedWindow implements Window {

    private float borderRadius;
    private TextStyle textStyle;
    private float opacity;

    public HighlightedWindow() {
        setBorderRadius(0);
        setTextStyle(TextStyle.BOLD);
        setOpacity(1);
    }

    @Override
    public void setBorderRadius(float radius) {
        this.borderRadius = radius;
    }

    @Override
    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    @Override
    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    @Override
    public void draw() {
        System.out.println("Generated highlighted window.");
    }
}
