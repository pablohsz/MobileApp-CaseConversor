package com.pablo.layout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LowerCase extends AppCompatActivity {

    Button lowButton, back;
    EditText lowEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lower_layout);
        lowButton = findViewById(R.id.buttonLower);
        lowEditText = findViewById(R.id.editTextLow);

        lowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lowEditText.setText(lowEditText.getText().toString().toLowerCase());
            }
        });
    }
}




