package dnd.dnd;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class quiz_page1 extends AppCompatActivity {
    private FloatingActionButton button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_quiz_page1 );
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button3= (FloatingActionButton) findViewById (R.id. floatingActionButton3);
        button3.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                open_quiz2();

            }
        });
    }
    public void open_quiz2() {
        Intent intent = new Intent (this, quiz_page2.class );
        startActivity ( intent );
    }


}

