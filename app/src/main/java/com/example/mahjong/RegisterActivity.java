package com.example.mahjong;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.ETC1;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName = (EditText)findViewById(R.id.name);
        final EditText etUserName = (EditText)findViewById(R.id.userName);
        final EditText etPassword = (EditText)findViewById(R.id.password);
        final EditText etAge = (EditText)findViewById(R.id.age);
        final Button registerBtn = (Button)findViewById(R.id.registerBtn);


    }
}
