package dnd.dnd;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private FloatingActionButton button;
    private EditText name;
    private static int SPLASH_TIME_OUT=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=(EditText)findViewById ( R.id.editText );

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button = (FloatingActionButton) findViewById (R.id. floatingActionButton);
        button.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if(name.length ()==0)
                {
                    name.setError ( "Enter Name" );
                }
                else {
                    Toast.makeText ( LoginActivity.this, "Done!", Toast.LENGTH_SHORT ).show ( );
                        opencrush_name ( );
                }
            }
        } );

    }
    public void opencrush_name(){
        Intent intent = new Intent(this, crush_name.class);
        startActivity ( intent );
    }

}
