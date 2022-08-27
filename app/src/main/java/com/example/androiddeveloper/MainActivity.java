package com.example.androiddeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.editOne);
    }

    public void doSomething(View view) {
        Intent l1 = new Intent(this, Second.class);
        l1.putExtra("user", e1.getText().toString());
        startActivity(l1);
    }
}