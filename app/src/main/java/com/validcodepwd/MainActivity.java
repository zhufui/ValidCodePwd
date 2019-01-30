package com.validcodepwd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gridpasswordview.GridPasswordView;

public class MainActivity extends AppCompatActivity {

    GridPasswordView gridPasswordView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridPasswordView2 = findViewById(R.id.gpv2);
        gridPasswordView2.setPasswordVisibility(true);
    }
}
