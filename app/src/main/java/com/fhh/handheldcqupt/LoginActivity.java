package com.fhh.handheldcqupt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login = findViewById(R.id.bt_login);
        Button register = findViewById(R.id.bt_register);
        register.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login:
                Toast.makeText(this,"登陆中...",Toast.LENGTH_SHORT).show();


                break;
            case R.id.bt_register:
                Intent register = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(register);
                break;
                default:
        }
    }
}
