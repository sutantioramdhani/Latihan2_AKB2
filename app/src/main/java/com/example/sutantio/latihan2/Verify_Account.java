package com.example.sutantio.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Verify_Account extends AppCompatActivity {
private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify__account);

        send = (Button)findViewById(R.id.BtnSendVA);

        send.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Verify_Account.this, User_Home.class);
                startActivity(intent);
            }
        });
    }
}
