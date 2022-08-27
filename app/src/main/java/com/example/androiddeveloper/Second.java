package com.example.androiddeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text1=(TextView) findViewById(R.id.result);

        Bundle b1 = getIntent().getExtras();
        String s1= b1.getString("user");
        text1.setText(s1);
    }
}