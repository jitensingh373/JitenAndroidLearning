package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgramingAdapter extends RecyclerView.Adapter<ProgramingAdapter.ProgramingViewHolder> {

    private String[] data;
    public ProgramingAdapter(String[] str){
        this.data = str;
    }

    @NonNull
    @Override
    public ProgramingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inf = LayoutInflater.from(parent.getContext());
        View view = inf.inflate(R.layout.list_items,parent,false);
        return new ProgramingViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProgramingViewHolder holder, int position) {
        String title = data[position];
        holder.txtValue.setText(title);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgramingViewHolder extends RecyclerView.ViewHolder{


        ImageView imgValue ;
        TextView txtValue ;

        public ProgramingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgValue = itemView.findViewById(R.id.img_value);
            txtValue = itemView.findViewById(R.id.txt_value);
        }
    }

}
