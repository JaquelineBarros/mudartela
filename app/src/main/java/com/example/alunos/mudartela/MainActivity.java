package com.example.alunos.mudartela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView activity;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = (TextView) findViewById(R.id.text1);
        btn = (Button) findViewById(R.id.button1);
    }
     public void btnClickAct1(View v){
         Intent it = new Intent(this, Activity2.class);
         startActivity(it);
     }
}
