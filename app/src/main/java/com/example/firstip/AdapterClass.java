package com.example.firstip;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterClass extends ArrayAdapter {

    private Context contacts;
    private String[] friends;
    private String[] theirContacts;

    public AdapterClass( Context contacts, int resource, String[] friends, String[] theirContacts) {
        super(contacts, resource);
        this.contacts = contacts;
        this.friends = friends;
        this.theirContacts = theirContacts;
    }

    @Override
    public int getCount() {
        return friends.length;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        String eachFriendHas= friends[position];
        String eachContactHas= theirContacts[position];
        return String.format("%s \n contact: %s", eachFriendHas, eachContactHas);

    }
}
