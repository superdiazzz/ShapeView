package superdiazzz.shapeview.shapeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by Nandaz on 27/01/2019.
 */
public class TriangleView extends ShapeView {

    private Point a, b, c;
    private Path path;

    public TriangleView(Context context) {
        super(context);
    }

    public TriangleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TriangleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void drawShape(Canvas canvas) {

        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        path.setFillType(Path.FillType.EVEN_ODD);
        path.lineTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.lineTo(a.x, a.y);
        path.close();
        canvas.drawPath(path, paint);

    }

    @Override
    protected void initShape() {

        int left = (getWidth()/2) - 50;
        a = new Point(left, 0);
        b = new Point(left, 200);
        c = new Point(left + 200, 100);

        path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);

    }
}

