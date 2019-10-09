package com.yuhu.sampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SampleActivity extends AppCompatActivity {


    Button btnActivity, btnFragment;
    EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        btnActivity = findViewById(R.id.btn_activity);
        btnFragment = findViewById(R.id.btn_fragment);
        etNama = findViewById(R.id.et_nama);

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleActivity.this,FragmentActivity.class);
                startActivity(intent);
            }
        });

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleActivity.this,IntentActivity.class);
                intent.putExtra("nama", etNama.getText().toString());

                startActivity(intent);
            }
        });
    }
}

