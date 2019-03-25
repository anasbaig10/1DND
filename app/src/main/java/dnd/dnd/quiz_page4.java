package dnd.dnd;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class quiz_page4 extends AppCompatActivity {
    private FloatingActionButton button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_quiz_page4 );
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button6 = (FloatingActionButton) findViewById (R.id. floatingActionButton6);
        button6.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                open_quiz5 ();

            }
        });
    }
    public void open_quiz5() {
        Intent intent = new Intent (this, quiz_page5.class );
        startActivity ( intent );
    }
    }

