package com.example.shamissa.a471lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button clearbutton;
    private Button numberbutton;
    private TextView fillIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clearbutton = (Button) findViewById(R.id.buttonclear);
        fillIn = (TextView) findViewById(R.id.textView2);

    }
    public void onNumberClick(View view){
        numberbutton = (Button) view;
        String ButtonText = numberbutton.getText().toString();
        fillIn.setText( fillIn.getText() + ButtonText);
    }
    public void onClearClick(View view){
        fillIn.setText("");

    }
    public void onBSClick(View view){
        if(fillIn.getText().length() > 0){
            fillIn.setText(fillIn.getText().subSequence(0,(fillIn.getText().length() - 1)));
        }

    }
}
