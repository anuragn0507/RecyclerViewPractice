package com.example.recyclerviewpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city,parent, false)
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

public static class ViewHolder extends RecyclerView.ViewHolder {
    public final View view;
    public final TextView name;
    public final TextView description;
    public final ImageView image;

    public ViewHolder (View view){
        super(view);
        this.view = view;
        name = view.findViewById(R.id.name);
        description = view.findViewById(R.id.description);
        image = view.findViewById(R.id.image);
    }
}
}


