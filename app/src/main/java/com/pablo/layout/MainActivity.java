package com.pablo.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button upButt, lowButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout); //Faz a ligação do Layout com o Java

        upButt = findViewById(R.id.upButton);
        lowButt = findViewById(R.id.lowButton);

        lowButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LowerCase.class);
                startActivity(i);
            }
        });

        upButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, UpperCase.class);
                startActivity(i);
            }
        });


        /*button1 = findViewById(R.id.button1);
        editText1 = findViewById(R.id.editTet1);
        editText2 = findViewById(R.id.editTet2);
        textView2 = findViewById(R.id.tetView2);
        //Toast.makeText(MainActivity.this, editText2.toString(), Toast.LENGTH_SHORT).show();

       button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soma = (Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString()));
                textView2.setText("RESPOSTA: " + String.valueOf(soma));
                //Toast.makeText(MainActivity.this, String.valueOf(soma), Toast.LENGTH_SHORT).show();
            }
        });*/

    }
}