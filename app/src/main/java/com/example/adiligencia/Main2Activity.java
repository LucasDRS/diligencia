package com.example.adiligencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void telahome(View view){

        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);

    }


    public void telacadastro(View view){

        Intent intent = new Intent(this, cadastro.class);
        startActivity(intent);

    }
}
