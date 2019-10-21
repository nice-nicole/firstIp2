package com.example.firstip.network;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.firstip.R;
import com.example.firstip.ui.UserDetailActivity;
import com.squareup.picasso.Picasso;

import java.util.List;


public class MyNewAdapter extends RecyclerView.Adapter<MyNewAdapter.ViewHolder> {
    private List<Item> items;
    private Context mContext;

    public MyNewAdapter(Context applicationContext, List<Item> itemList){
        this.mContext = applicationContext;
        this.items= itemList;
        }

    @Override
    public MyNewAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_user_detail, viewGroup, false);
        return new ViewHolder(view);
    }
//        @Override
//    public MyNewAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_user_detail, viewGroup, false);
//        return new ViewHolder(view);
//    }

    @Override
    public void onBindViewHolder(MyNewAdapter.ViewHolder viewHolder, int i){
    viewHolder.title.setText(items.get(i).getLogin());
    viewHolder.githubUrl.setText(items.get(i).getHtmlUrl());

        Picasso.get()
                .load(items.get(i).getAvatarUrl())
                .into(viewHolder.imageView);
    }
    @Override
    public int getItemCount(){
        return items.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title, githubUrl;
        private ImageView imageView;

        public ViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            githubUrl= (TextView) view.findViewById(R.id.githubUrl);
            imageView=(ImageView) view.findViewById(R.id.cover);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick(View v){
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION){
                        Item clickedDataItem = items.get(pos);
                        Intent intent = new Intent(mContext, UserDetailActivity.class);
                        intent.putExtra("login", items.get(pos).getLogin());
                        intent.putExtra("html_url", items.get(pos).getHtmlUrl());
                        intent.putExtra("avatar_url", items.get(pos).getAvatarUrl());

                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(intent);
                        Toast.makeText(v.getContext(), "you clicked" +clickedDataItem.getLogin(),Toast.LENGTH_SHORT).show();
                    }
                }
            });
































        }
    }
}