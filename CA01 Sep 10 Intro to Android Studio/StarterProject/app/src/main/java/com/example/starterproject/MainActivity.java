package com.example.starterproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView numberText;
    Button btnCount;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.click_activity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        numberText = findViewById(R.id.numberText);
        btnCount = findViewById(R.id.btnCount);
        btnReset = findViewById(R.id.btnReset);
    }

    public void countFunction(View v) {
        int n = Integer.parseInt(numberText.getText().toString());
        n++;
        numberText.setText(""+n);
    }

    public void resetFunction(View v) {
        numberText.setText("0");
    }
}