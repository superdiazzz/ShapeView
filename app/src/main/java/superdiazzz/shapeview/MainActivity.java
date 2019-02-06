package superdiazzz.shapeview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

import superdiazzz.shapeview.shapeview.CircleView;
import superdiazzz.shapeview.shapeview.RectangleView;

public class MainActivity extends AppCompatActivity {

    private RectangleView rectangleView;
    private CircleView circleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rectangleView = findViewById(R.id.rectangle);
        circleView = findViewById(R.id.circle);


    }

    public void changeColor(View view) {

        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        rectangleView.setColor(color);
        rectangleView.setLengthSide(50);

        Random rnd2 = new Random();
        int color2 = Color.argb(255, rnd2.nextInt(256), rnd2.nextInt(256), rnd2.nextInt(256));
        circleView.setColor(color2);
    }
}
