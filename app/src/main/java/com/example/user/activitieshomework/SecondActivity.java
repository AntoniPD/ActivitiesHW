package com.example.user.activitieshomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    Button btnContinue;
    static EditText edtAge;
    static EditText edtAdress;
    static EditText edtTown;
    static EditText edtBirthday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnContinue = (Button) findViewById(R.id.btn_continiue);
        edtAge = (EditText) findViewById(R.id.edt_age);
        edtAdress = (EditText) findViewById(R.id.edt_adress);
        edtTown = (EditText) findViewById(R.id.edt_town);
        edtBirthday = (EditText) findViewById(R.id.edt_birthday);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,FinalActivity.class);
                startActivity(intent);
            }
        });
     }
}
