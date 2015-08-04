package edu.rrm89cornell.asymmetricmetronome;

import edu.rrm89cornell.asymmetricmetronome.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up the button sound
        MediaPlayer mp = MediaPlayer.create(this, R.raw.click);

        Button bStart = (Button) findViewById(R.id.button1);
    }
}