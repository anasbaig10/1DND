package dnd.dnd;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class quiz_page5 extends AppCompatActivity {
    private FloatingActionButton button7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_quiz_page5 );
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button7 = (FloatingActionButton) findViewById (R.id. floatingActionButton7);
        button7.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                final_page();

            }
        });
    }
    public void final_page() {
        Intent intent = new Intent (this, final_page.class );
        startActivity ( intent );
    }
    }

