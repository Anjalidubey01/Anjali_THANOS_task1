package com.example.android.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView hu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        logo jk = new logo();
        jk.start();
        hu = (ImageView)findViewById(R.id.imageView6);
    }
    private class logo extends Thread{
        public void run(){
            try{
                Animation fade = new AlphaAnimation(1,0);
                fade.setInterpolator(new AccelerateInterpolator());
                fade.setStartOffset(500); // Start fading out after 500 milli seconds
                fade.setDuration(1500);
                hu.setAnimation(fade);

                sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent i = new Intent(Main2Activity.this,MainActivity.class);
            startActivity(i);
            Main2Activity.this.finish();
        }
    }

}
