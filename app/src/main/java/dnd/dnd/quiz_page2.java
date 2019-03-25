package dnd.dnd;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class quiz_page2 extends AppCompatActivity {
    private FloatingActionButton button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_quiz_page2 );
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button4 = (FloatingActionButton) findViewById (R.id. floatingActionButton4);
        button4.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                open_quiz3 ();

            }
        });
    }
    public void open_quiz3() {
        Intent intent = new Intent (this, quiz_page3.class );
        startActivity ( intent );
    }

}

