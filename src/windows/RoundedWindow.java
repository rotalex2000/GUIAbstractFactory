package windows;

import utils.TextStyle;

public class RoundedWindow implements Window {

    private float borderRadius;
    private TextStyle textStyle;
    private float opacity;

    public RoundedWindow() {
        this.draw();
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
        setBorderRadius(0.5F);
        setTextStyle(TextStyle.NORMAL);
        setOpacity(0);
        System.out.println("Generated rounded window.");
    }
}
