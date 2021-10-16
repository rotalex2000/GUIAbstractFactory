package windows;

import utils.TextStyle;

public class ClassicWindow implements Window {

    private float borderRadius;
    private TextStyle textStyle;
    private float opacity;

    public ClassicWindow() {
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
        setBorderRadius(0);
        setTextStyle(TextStyle.NORMAL);
        setOpacity(0.5F);
        System.out.println("Generated classic window.");
    }
}
