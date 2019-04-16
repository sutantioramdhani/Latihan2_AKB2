package com.example.sutantio.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
 private Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

            reg = (Button)findViewById(R.id.BtnRegister);

            reg.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Register.this, Almost_There.class);
                    startActivity(intent);
                }
            });
    }
}
