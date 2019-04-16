package com.example.sutantio.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Almost_There extends AppCompatActivity {
private Button verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost__there);


            verify = (Button)findViewById(R.id.BtnVerify);

            verify.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Almost_There.this, Verify_Account.class);
                    startActivity(intent);
                }
            });
    }
}
