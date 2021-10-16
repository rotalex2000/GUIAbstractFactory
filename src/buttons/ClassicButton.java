package buttons;

import utils.TextStyle;

public class ClassicButton implements Button {

    private float borderRadius;
    private TextStyle textStyle;

    public ClassicButton() {
        this.setBorderRadius(0);
        this.setTextStyle(TextStyle.NORMAL);
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
    public void draw() {
        System.out.println("Generated classic button.");
    }
}