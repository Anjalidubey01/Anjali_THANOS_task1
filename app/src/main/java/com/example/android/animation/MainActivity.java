package com.example.android.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.provider.ContactsContract;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import static android.view.View.VISIBLE;


public class MainActivity extends AppCompatActivity {
    private ImageView kl,mn,op,qr,st;
    ViewGroup vg;
    int click = 0;
    float y,yt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kl = (ImageView) findViewById(R.id.imageView2);
        mn = (ImageView)findViewById(R.id.imageView) ;
        op = (ImageView)findViewById(R.id.imageView3);
        qr = (ImageView)findViewById(R.id.imageView4);
        st = (ImageView)findViewById(R.id.imageView5) ;
        vg = (ViewGroup) findViewById(R.id.layout);
        pq(kl);
        pq(mn);
        pq(op);
        pq(qr);
        pq(st);
        vg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {click++;
            if(click%2 == 0){st.setVisibility(VISIBLE);
            kl.setVisibility(VISIBLE);
                re(kl);
               re(mn);
                re(op);
                re(qr);
                re(st);
            }
            else{mn.setVisibility(VISIBLE); e(kl);
               e(mn);
                e(op);
                e(qr);
                e(st);

            }


            }
        });

}
public void pq(ImageView er){ObjectAnimator anim = ObjectAnimator.ofFloat(er,"translationY",0f,1500f);
        anim.setDuration(4000);
        anim.setRepeatCount(0);
       anim.start();
       anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
           @Override
           public void onAnimationUpdate(ValueAnimator animation) {
              y = (float)animation.getAnimatedValue();
           }
       });


    }public void e(ImageView rt){ObjectAnimator ni = ObjectAnimator.ofFloat(rt,"translationY",y,-1500.0f);
        ni.setDuration(4000);
        ni.setRepeatCount(0);
        ni.start();
       ni.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
           @Override
           public void onAnimationUpdate(ValueAnimator animation) {
               yt = (float)animation.getAnimatedValue();
           }
       });

    }

public void re(ImageView yu){ObjectAnimator ani= ObjectAnimator.ofFloat(yu,"translationY",yt,1500.0f);
    ani.setDuration(4000);
    ani.setRepeatCount(0);
    ani.start();
    ani.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public void onAnimationUpdate(ValueAnimator animation) {
            y = (float)animation.getAnimatedValue();
        }
    });


}
}
