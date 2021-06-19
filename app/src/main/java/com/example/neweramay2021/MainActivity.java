package com.example.neweramay2021;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String username = "test@gmail.com", password = "password123";
    private EditText edtUsername, edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews(){
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    private void setListeners(){
        btnLogin.setOnClickListener(view -> {
            String usernameInput = edtUsername.getText().toString();
            String passwordInput = edtPassword.getText().toString();

            if(usernameInput.equals(username) && passwordInput.equals(password)){
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this,"wrong Username or Password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}