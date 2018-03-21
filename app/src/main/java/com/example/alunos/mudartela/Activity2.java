package com.example.alunos.mudartela;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Alunos on 07/03/2018.
 */

public class Activity2 extends AppCompatActivity {
    TextView activity;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        activity = (TextView) findViewById(R.id.text2);
        btn = (Button) findViewById(R.id.button2);
    }
    public void btnClickAct2(View v){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
