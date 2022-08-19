package com.pablo.layout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UpperCase extends AppCompatActivity {

    Button upButton;
    EditText upEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upper_layout);
        upButton = findViewById(R.id.buttonUpper);
        upEditText = findViewById(R.id.editTextUpper);

        //Fazer validação se EditText está vazia ou não

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upEditText.setText(upEditText.getText().toString().toUpperCase());
            }
        });
    }
}




