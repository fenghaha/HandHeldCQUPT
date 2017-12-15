package com.fhh.handheldcqupt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class SignupActivity extends AppCompatActivity {

    private EditText textUsername;
    private EditText textPassword;
    private EditText textPhoneNumber;
    private Spinner spinnerSex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        textUsername = findViewById(R.id.et_nickname);
        textPassword = findViewById(R.id.et_register_password);
        textPhoneNumber = findViewById(R.id.et_phone);
        spinnerSex = findViewById(R.id.sp_sex);
        Button back = findViewById(R.id.bt_back_of_register);
        Button signUp = findViewById(R.id.bt_sign_up);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = textUsername.getText().toString();
                String password = textPassword.getText().toString();
                String phoneNumber = textPhoneNumber.getText().toString();
              if(!userName.equals("")&&!password.equals("")&&!phoneNumber.equals("")){
                  Toast.makeText(SignupActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                  finish();
              }
              else {
                  Toast.makeText(SignupActivity.this,"注册失败,请正确输入相关内容",Toast.LENGTH_SHORT).show();
              }
            }
        });
        back .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }



}
