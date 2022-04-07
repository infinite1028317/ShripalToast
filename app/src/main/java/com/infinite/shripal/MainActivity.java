package com.infinite.shripal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.infinite.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this,"Welcome Shripal This is your first Dependency");

    }


}