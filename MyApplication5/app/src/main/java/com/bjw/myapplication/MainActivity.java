package com.bjw.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView2;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);
        Button button = (Button) findViewById(R.id.button);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(getApp().getS());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getApp().setS(et.getText().toString());
                textView2.setText(getApp().getS());
            }
        });
    }
    public App getApp() {
        return (App) getApplicationContext();
    }
}
