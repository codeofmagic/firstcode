package com.example.firstcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.library.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWorld h = new HelloWorld();
        h.sayHello();
    }
}
