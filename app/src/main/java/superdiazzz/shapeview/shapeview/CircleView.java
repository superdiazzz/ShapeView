package superdiazzz.shapeview.shapeview;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by Nandaz on 26/01/2019.
 */
public class CircleView extends ShapeView {

    private float cX, cY;
    private float radius = 100f;
    private int color;


    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        drawShape(canvas);

    }

    @Override
    protected void drawShape(Canvas canvas) {

        cX = getWidth()/2;
        cY = getHeight()/2;
        canvas.drawCircle(cX, cY, radius, paint);

    }

    @Override
    protected void initShape() {

    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
        setFillColor(color);
    }
}
