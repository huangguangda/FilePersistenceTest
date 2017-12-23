package cn.edu.gdmec.android.filepersistencetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        edit = (EditText) findViewById ( R.id.edit );
    }

    @Override
    protected void onDestroy(){
        super.onDestroy ();
        String inputText = edit.getText ().toString ();
        save(inputText);
    }

    public void save(String inputText){

    }
}
