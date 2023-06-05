package com.example.giftchanger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class presentAdapter extends RecyclerView.Adapter<presentAdapter.ViewHolder> { //адаптер из 3 дз все по шаблону ничего нового
    private final LayoutInflater inflater;
    private final List<Present> presents;

    public presentAdapter(Context context, List<Present> presents) {
        this.inflater=LayoutInflater.from(context);
        this.presents=presents;
    }


    @NonNull
    @Override
    public presentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull presentAdapter.ViewHolder holder, int position) {
        Present present=presents.get(position);
        holder.presentView.setImageResource(present.getPresentResource());
        holder.nameView.setText(present.getName());
        holder.priceView.setText(present.getPrice());
        holder.fameView.setText(present.getGender());
    }

    @Override
    public int getItemCount() {
        return presents.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {//вложенный класс (вроде)
        final ImageView presentView;
        final TextView nameView, priceView, fameView;

        ViewHolder(View view) {
            super(view);
           presentView = view.findViewById(R.id.presentResource);
            nameView = view.findViewById(R.id.name);
            priceView = view.findViewById(R.id.price);
            fameView = view.findViewById(R.id.fame);
        }
    }
}
