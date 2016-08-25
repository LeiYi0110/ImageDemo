package com.example.lei.imagedemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements ImageListViewAdapter.ImageListClickedDelegate {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView)findViewById(R.id.imageList);
        ImageListViewAdapter adapter = new ImageListViewAdapter(this,this);
        listView.setAdapter(adapter);

        /*
        final ImageView imageView = (ImageView)findViewById(R.id.singleImageView);

        imageView.setTag(0);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((int)imageView.getTag() == 0)
                {
                    WindowManager wm = MainActivity.this.getWindowManager();

                    int width = wm.getDefaultDisplay().getWidth();
                    int height = ((FrameLayout)findViewById(R.id.backgroundLayout)).getHeight();

                    int widthView = view.getWidth();
                    int heightView = view.getHeight();

                    float y = (height - heightView)/2;
                    long duration = 100;
                    float scale = (float) width/widthView;

                    ObjectAnimator animatorScaleX = ObjectAnimator.ofFloat(view, "scaleX", scale);
                    animatorScaleX.setDuration(duration);

                    ObjectAnimator animatorScaleY = ObjectAnimator.ofFloat(view, "scaleY", scale);
                    animatorScaleY.setDuration(duration);



                    ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "x", (view.getWidth()/2)*(scale - 1));
                    animatorX.setDuration(duration);

                    ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "y",y);
                    animatorY.setDuration(duration);



                    AnimatorSet animSetXY = new AnimatorSet();
                    //animSetXY.playTogether(animatorScaleX, animatorScaleY,animatorX,animatorY);

                    animSetXY.playTogether(animatorX,animatorY,animatorScaleX, animatorScaleY);
                    animSetXY.start();
                    imageView.setTag(1);
                }
                else
                {
                    long duration = 100;
                    float scale = 1.0f;//(float) width/widthView;
                    ObjectAnimator animatorScaleX = ObjectAnimator.ofFloat(view, "scaleX", scale);
                    animatorScaleX.setDuration(duration);

                    ObjectAnimator animatorScaleY = ObjectAnimator.ofFloat(view, "scaleY", scale);
                    animatorScaleY.setDuration(duration);



                    ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "x", 0);
                    animatorX.setDuration(duration);

                    ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "y",0);
                    animatorY.setDuration(duration);



                    AnimatorSet animSetXY = new AnimatorSet();
                    //animSetXY.playTogether(animatorScaleX, animatorScaleY,animatorX,animatorY);

                    animSetXY.playTogether(animatorX,animatorY,animatorScaleX, animatorScaleY);
                    animSetXY.start();
                    imageView.setTag(0);
                }







            }
        });
        */
    }

    @Override
    public void didClickedImageView(final ImageView imageView1)
    {
        final ImageView imageView = new ImageView(this);
        imageView.setImageDrawable(imageView1.getDrawable());
        FrameLayout layout = (FrameLayout)findViewById(R.id.backgroundLayout);
        layout.addView(imageView);
        imageView.setTag(0);

        //layout.getLocationOnScreen();
        /*
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((int)imageView.getTag() == 0)
                {
                    WindowManager wm = MainActivity.this.getWindowManager();

                    int width = wm.getDefaultDisplay().getWidth();
                    int height = ((FrameLayout)findViewById(R.id.backgroundLayout)).getHeight();

                    int widthView = view.getWidth();
                    int heightView = view.getHeight();

                    float y = (height - heightView)/2;
                    long duration = 100;
                    float scale = (float) width/widthView;

                    ObjectAnimator animatorScaleX = ObjectAnimator.ofFloat(view, "scaleX", scale);
                    animatorScaleX.setDuration(duration);

                    ObjectAnimator animatorScaleY = ObjectAnimator.ofFloat(view, "scaleY", scale);
                    animatorScaleY.setDuration(duration);



                    ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "x", (view.getWidth()/2)*(scale - 1));
                    animatorX.setDuration(duration);

                    ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "y",y);
                    animatorY.setDuration(duration);



                    AnimatorSet animSetXY = new AnimatorSet();
                    //animSetXY.playTogether(animatorScaleX, animatorScaleY,animatorX,animatorY);

                    animSetXY.playTogether(animatorX,animatorY,animatorScaleX, animatorScaleY);
                    animSetXY.start();
                    imageView.setTag(1);
                }
                else
                {
                    long duration = 100;
                    float scale = 1.0f;//(float) width/widthView;
                    ObjectAnimator animatorScaleX = ObjectAnimator.ofFloat(view, "scaleX", scale);
                    animatorScaleX.setDuration(duration);

                    ObjectAnimator animatorScaleY = ObjectAnimator.ofFloat(view, "scaleY", scale);
                    animatorScaleY.setDuration(duration);



                    ObjectAnimator animatorX = ObjectAnimator.ofFloat(view, "x", 0);
                    animatorX.setDuration(duration);

                    ObjectAnimator animatorY = ObjectAnimator.ofFloat(view, "y",0);
                    animatorY.setDuration(duration);



                    AnimatorSet animSetXY = new AnimatorSet();
                    //animSetXY.playTogether(animatorScaleX, animatorScaleY,animatorX,animatorY);

                    animSetXY.playTogether(animatorX,animatorY,animatorScaleX, animatorScaleY);
                    animSetXY.start();
                    imageView.setTag(0);
                }







            }
        });
        */
    }
}
