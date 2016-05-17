package com.example.android.infodengue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irDengue(View view){
        Intent intent = new Intent(this, dengue.class);
        startActivity(intent);
    }

    public void irChikun(View view){
        Intent intent = new Intent(this, Chikungunya.class);
        startActivity(intent);
    }

    public void irZika(View view){
        Intent intent = new Intent(this, Zika.class);
        startActivity(intent);
    }

    public void irAedes(View view){
        Intent intent = new Intent(this, Aedes.class);
        startActivity(intent);
    }

    public void irCombate(View view){
        Intent intent = new Intent(this, Combate.class);
        startActivity(intent);
    }
}
