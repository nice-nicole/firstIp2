package com.example.firstip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewProfile extends AppCompatActivity {
private TextView username;
private TextView userphone;
private Button viewContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        username=(TextView) findViewById(R.id.user);
        userphone=(TextView) findViewById(R.id.phoneNber);
        viewContacts=(Button) findViewById(R.id.uploadC);


        Intent getdata= getIntent();
        String name= getdata.getStringExtra("username");
        String telephone= getdata.getStringExtra("phone");
        username.setText(name);
        userphone.setText(telephone);

        viewContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPage4= new Intent(ViewProfile.this, Contacts.class);
                startActivity(goToPage4);
            }
        });
    }
}
