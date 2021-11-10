package com.ksl.mitbe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in2);


        TextView daftarsekarang = findViewById(R.id.daftar_sekarang);
        TextView ayomasuk = findViewById(R.id.ayomasuk_btn);

        ayomasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmasuk_pb = new Intent(SignInActivity.this,PanicButtonActivity.class);
                startActivity(intentmasuk_pb);
            }
        });

        daftarsekarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);



            }
        });

    }
}