package superdiazzz.shapeview.shapeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by Nandaz on 25/01/2019.
 */
public class RectangleView extends ShapeView {

    private static final int SQUARE_SIZE = 200;
    private Rect rect;

    private int color;
    private int lengthSide = 200;

    public RectangleView(Context context) {
        super(context);
    }

    public RectangleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RectangleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void drawShape(Canvas canvas) {

        rect.left = 0;
        rect.top = 0;
        rect.right = lengthSide;
        rect.bottom = lengthSide;

//        rect.left = (int) (getWidth()/2) - (int) (SQUARE_SIZE/2);
//        rect.top = (getHeight()/2) - (SQUARE_SIZE/2);
//        rect.right = rect.left + SQUARE_SIZE;
//        rect.bottom = rect.top + SQUARE_SIZE;
        canvas.drawRect(rect, paint);
    }

    @Override
    protected void initShape() {
        rect = new Rect();
        lengthSide = getWidth();
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
        setFillColor(color);
    }

    public int getLengthSide() {
        return lengthSide;
    }

    public void setLengthSide(int lengthSide) {
        // TODO need to convert to Dp
        this.lengthSide = lengthSide;
    }
}

