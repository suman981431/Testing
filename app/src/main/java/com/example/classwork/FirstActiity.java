package com.example.classwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActiity extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn1 = findViewById(R.id.BackToHomeBtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FirstActiity.this,MainActivity.class);
                startActivity(i);
            }
        });



    }
}
