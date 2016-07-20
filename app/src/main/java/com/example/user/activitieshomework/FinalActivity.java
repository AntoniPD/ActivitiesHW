package com.example.user.activitieshomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView personInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        personInfo = (TextView) findViewById(R.id.txt_personInfo);
        personInfo.setText(String.valueOf(MainActivity.edtName.getText().toString() + "\n" + SecondActivity.edtAge.getText().toString() + "\n" + SecondActivity.edtAdress.getText().toString()
                + "\n" +  SecondActivity.edtTown.getText().toString() + "\n" + SecondActivity.edtBirthday.getText().toString()));
    }
}
