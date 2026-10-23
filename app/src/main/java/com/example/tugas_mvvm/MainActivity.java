
package com.example.tugas_mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvCounter;
    private Button btnIncrement;
    private int data = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(
                this,
                "MAIN ACTIVITY AKTIF",
                Toast.LENGTH_LONG
        ).show();

        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tvCounter);
        btnIncrement = findViewById(R.id.btnIncrement);

        btnIncrement.setOnClickListener(view -> {
            data++;

            tvCounter.setText(String.valueOf(data));

            Toast.makeText(
                    MainActivity.this,
                    "Angka bertambah menjadi " + data,
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}
