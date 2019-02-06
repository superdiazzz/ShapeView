package superdiazzz.shapeview.shapeview;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Nandaz on 26/01/2019.
 */
public abstract class ShapeView extends View {

    public Paint paint;

    public ShapeView(Context context) {
        super(context);
        init(context);
        initShape();
    }

    public ShapeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
        initShape();
    }

    public ShapeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
        initShape();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ShapeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
        initShape();
    }

    private void init(Context context){
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public void setFillColor(int idColor){
        paint.setColor(idColor);
        this.postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        drawShape(canvas);
    }

    /**
     * put different behavior for each child,
     * this method directly access onDraw from view
     * draw anything here!
     */
    protected abstract void drawShape(Canvas canvas);

    /**
     * if you need to initialize any params, provide it here
     */
    protected abstract void initShape();

}
