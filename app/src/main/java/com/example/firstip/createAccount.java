package com.example.firstip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class createAccount extends AppCompatActivity {

    private EditText name;
    private EditText tel;
    private Button continueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        name=(EditText) findViewById(R.id.username);
        tel=(EditText) findViewById(R.id.phone);
        continueBtn=(Button) findViewById(R.id.continueButton);


        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namename= name.getText().toString();
                String telephone= tel.getText().toString();
                Intent goToPage3= new Intent(createAccount.this, ViewProfile.class);
                goToPage3.putExtra("username", namename);
                goToPage3.putExtra("phone", telephone);
                startActivity(goToPage3);
            }
        });

    }
}
