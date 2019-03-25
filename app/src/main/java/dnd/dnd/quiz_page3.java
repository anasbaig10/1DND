package dnd.dnd;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class quiz_page3 extends AppCompatActivity {
    private FloatingActionButton button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_quiz_page3 );
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button5 = (FloatingActionButton) findViewById (R.id. floatingActionButton5);
        button5.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                open_quiz4 ();

            }
        });
    }
    public void open_quiz4() {
        Intent intent = new Intent (this, quiz_page4.class );
        startActivity ( intent );
    }
    }

