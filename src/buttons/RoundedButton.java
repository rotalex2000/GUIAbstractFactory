package buttons;

import utils.TextStyle;

public class RoundedButton implements Button {

    private float borderRadius;
    private TextStyle textStyle;

    public RoundedButton() {
        this.setBorderRadius(0.5F);
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
        System.out.println("Generated rounded button.");
    }
}
