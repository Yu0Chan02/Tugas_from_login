package com.example.tugasfromlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_username, et_nim;
    private Button masuk_button;
    private String username="Syafa'at Ramadhan";
    private String nim="F55122020";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = findViewById(R.id.username);
        et_nim = findViewById(R.id.nim);
        masuk_button = findViewById(R.id.button);

        masuk_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_username.getText().toString().equalsIgnoreCase(username) && et_nim.getText().toString().equalsIgnoreCase(nim)){
                    Intent login = new Intent(MainActivity.this, HasilActivity.class);
                    startActivity(login);

                    Toast.makeText(MainActivity.this,"Berhasil Login", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"USERNAME ATAU NIM SALAH", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}