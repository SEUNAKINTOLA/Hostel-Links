package com.example.akintolaoluwaseun.hostellinks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

/**
 * Created by AKINTOLA OLUWASEUN on 7/8/2015.
 */
public class short_info extends AppCompatActivity {

    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private ViewFlipper mViewFlipper;
    private Animation.AnimationListener mAnimationListener;
    private Context mContext;



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("deprecation")
    private final GestureDetector detector = new GestureDetector(new SwipeGestureDetector());


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.short_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mContext = this;
        mViewFlipper = (ViewFlipper) this.findViewById(R.id.view_flipper);
        mViewFlipper.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
                detector.onTouchEvent(event);
                return true;
            }
        });




        final Button bt = (Button) findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", bt.getText().toString());
                startActivity(intent);
            }
        });
        final Button At = (Button) findViewById(R.id.buttonA);

        At.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", At.getText().toString());
                             startActivity(intent);
            }
        });

        final Button ct = (Button) findViewById(R.id.button3);

        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", ct.getText().toString());
                startActivity(intent);
            }
        });

        final Button dt = (Button) findViewById(R.id.button4);

        dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", dt.getText().toString());
                startActivity(intent);
            }
        });

        final Button et = (Button) findViewById(R.id.button5);

        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", et.getText().toString());
                startActivity(intent);
            }
        });

        final Button ft = (Button) findViewById(R.id.button6);

        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", ft.getText().toString());
                startActivity(intent);
            }
        });


        final Button gt = (Button) findViewById(R.id.button7);

        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", gt.getText().toString());
                startActivity(intent);
            }
        });


        final Button ht = (Button) findViewById(R.id.button8);

        ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", ht.getText().toString());
                startActivity(intent);
            }
        });


        final Button it = (Button) findViewById(R.id.button9);

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", it.getText().toString());
                startActivity(intent);
            }
        });


        final Button jt = (Button) findViewById(R.id.button10);

        jt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", jt.getText().toString());
                startActivity(intent);
            }
        });


        final Button kt = (Button) findViewById(R.id.button11);

        kt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", kt.getText().toString());
                startActivity(intent);
            }
        });


        final Button lt = (Button) findViewById(R.id.button12);

        lt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(short_info.this, long_info.class);

                intent.putExtra("thetext", lt.getText().toString());
                startActivity(intent);
            }
        });






    }



    class SwipeGestureDetector extends SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            try {
                // right to left swipe
                if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.left_in));
                    mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext, R.anim.left_out));
                    // controlling animation
                    mViewFlipper.getInAnimation().setAnimationListener(mAnimationListener);
                    mViewFlipper.showNext();
                    return true;
                } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.right_in));
                    mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext,R.anim.right_out));
                    // controlling animation
                    mViewFlipper.getInAnimation().setAnimationListener(mAnimationListener);
                    mViewFlipper.showPrevious();
                    return true;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return false;
        }
    }
}
