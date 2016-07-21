package com.example.apple.zhuapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void shangjia(View v){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void tuijian(View v){
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}
