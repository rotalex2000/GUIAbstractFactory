package buttons;

import utils.TextStyle;

public class HighlightedButton implements Button {

    private float borderRadius;
    private TextStyle textStyle;

    public HighlightedButton() {
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
    public void draw() {
        this.setBorderRadius(0);
        this.setTextStyle(TextStyle.BOLD);
        System.out.println("Generated highlighted button.");
    }
}
