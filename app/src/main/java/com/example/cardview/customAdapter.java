package com.example.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class customAdapter extends RecyclerView.Adapter<customAdapter.viewHolder>{
    //data
    private ArrayList<viewModel> cardviewdata;
    private Context context;

    //CREATING CONSTRUCTER
    public customAdapter(ArrayList<viewModel> cardviewdata, Context context) {
        this.cardviewdata = cardviewdata;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())

        .inflate(R.layout.cardview_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        viewModel model=cardviewdata.get(position);
        holder.title.setText(model.getTilte());
        holder.image.setImageResource(model.getImage());

    }

    @Override
    public int getItemCount() {
        return cardviewdata.size();

    }

    //VIEW HOLDER
    public class viewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private ImageView image;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            image=itemView.findViewById(R.id.imageview);

        }
    }
}
