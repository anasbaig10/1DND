package dnd.dnd;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class crush_name extends AppCompatActivity {
    EditText crushname;
    private FloatingActionButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_crush_name );
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        crushname=(EditText)findViewById ( R.id.editText2 );
        button2 = (FloatingActionButton) findViewById (R.id. floatingActionButton2);
        button2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if(crushname.length ()==0)
                {
                    crushname.setError ( "Enter Name" );
                }
                else {
                    open_Quiz1 ();

                }
            }
        } );
    }
    public void open_Quiz1() {
        Intent intent = new Intent ( this, quiz_page1.class );
        startActivity ( intent );
    }
}
