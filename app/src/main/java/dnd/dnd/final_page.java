package dnd.dnd;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import com.luolc.emojirain.EmojiRainLayout;
import com.plattysoft.leonids.ParticleSystem;
import com.tomer.fadingtextview.FadingTextView;

import java.util.Random;

public class final_page extends AppCompatActivity {
    public FadingTextView fadingTextView;
    private EmojiRainLayout mContainer;
    public FloatingActionButton share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_final_page );
        fadingTextView =findViewById ( R.id.fading_text_view );
       ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Random rand = new Random ();
        int value = rand.nextInt(2);
        if(value==0) {

            String[] example1={"Degi!!!!!!"};
            fadingTextView.setTexts ( example1 );
            fadingTextView.setTimeout ( 1500,FadingTextView.MILLISECONDS);


            new ParticleSystem(this, 80, R.drawable.confeti2, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.3f, 180, 0)
                    .setRotationSpeed(144)
                    .setAcceleration(0.00005f, 90)
                    .emit(findViewById(R.id.emiter_top_right), 1000);

            new ParticleSystem(this, 80, R.drawable.confeti3, 10000)
                    .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                    .setRotationSpeed(144)
                    .setAcceleration(0.00005f, 90)
                    .emit(findViewById(R.id.emiter_top_left), 1000);


        }
        else {
            String[] example1={"Nahi Degi!!"};
            fadingTextView.setTexts ( example1 );
            fadingTextView.setTimeout ( 1500,FadingTextView.MILLISECONDS);
            mContainer = (EmojiRainLayout) findViewById(R.id.group_emoji_container);

            mContainer.addEmoji(R.drawable.emojil);
            mContainer.addEmoji(R.drawable.icon77);




            mContainer.setPer(10);


            mContainer.setDuration(7200);


            mContainer.setDropDuration(2400);


            mContainer.setDropFrequency(500);
            mContainer.startDropping();




        }
        share=(FloatingActionButton)findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent=new Intent(Intent.ACTION_SEND);
                myintent.setType("text/plain");
                String sharebd ="Degi or Nahi";
                String sharesub="Hey come and check out your status on your crush";
                myintent.putExtra(Intent.EXTRA_SUBJECT,sharebd);
                myintent.putExtra(Intent.EXTRA_TEXT,sharesub);
                startActivity(Intent.createChooser(myintent,"Share Using"));
            }
        });



    }
}
