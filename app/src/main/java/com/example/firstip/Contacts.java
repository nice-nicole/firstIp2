package com.example.firstip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Contacts extends AppCompatActivity {

    private ListView list;

    private String[] friends = new String[] {"Nicole", "Kelly", "Bercy", "Jesus","Judicael","Jonael","Paola", "Ella", "Jules","Celia", "Dorian","Kim","Berly"};
    private String[] theirContacts= new String[]{"0786720958", "0737474056", "0788555291", "07872394732", "078567207654","75789390","71766897","69292438","78123456","78986543","76549235","75412098","0786720958"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        AdapterClass ad = new AdapterClass(this, android.R.layout.simple_list_item_1, friends, theirContacts);
        list = (ListView) findViewById(R.id.contact);
        list.setAdapter(ad);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                    String eachFriendHas = ((TextView) view).getText().toString();
                    Toast.makeText(Contacts.this, eachFriendHas, Toast.LENGTH_SHORT).show();

            }
        });


    }
}

