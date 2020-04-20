package com.example.unlock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Backpressing disabled!!!", Toast.LENGTH_SHORT).show();
    }
}
