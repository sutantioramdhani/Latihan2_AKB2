package com.example.sutantio.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            register = (TextView)findViewById(R.id.textregister);

            register.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Register.class);
                    startActivity(intent);
                }
            });
    }
}
