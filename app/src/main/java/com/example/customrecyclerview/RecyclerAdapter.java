package com.example.customrecyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String [] title={"word",
    "excel",
    "PowerPoint",
    "outlook"};

    private String[] details={ "editeur de text",
    "tableur",
    "logiciel de presentation",
    "client de courrier electronique"};
    private int[]image={ R.drawable.word, R.drawable.excel, R.drawable.powerpoint, R.drawable.outlook};


    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ItemImage;
        private TextView ItemTitle;
        private TextView ItemDetail;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemImage= itemView.findViewById(R.id.item_image);
            ItemTitle=itemView.findViewById(R.id.item_title);
            ItemDetail=itemView.findViewById(R.id.item_detail);

        }
    }
    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}
