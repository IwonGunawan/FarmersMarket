package com.farmers.market;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.farmers.market.utils.VegetableModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ListViewHolder> {

    private ArrayList<VegetableModel> listData;
    public Context context;

    public MainAdapter(ArrayList<VegetableModel> list) {
        this.listData = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final VegetableModel vegetableModel = listData.get(position);

        holder.sName.setText(vegetableModel.getName());
        holder.sCategory.setText(vegetableModel.getDetail());
        holder.sPrice.setText(vegetableModel.getPrice());
        holder.iImage.setImageResource(vegetableModel.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("vKey", position);
                intent.putExtra("vName", vegetableModel.getName());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView sName, sCategory, sPrice;
        ImageView iImage;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();

            sName = itemView.findViewById(R.id.tv_name);
            sCategory = itemView.findViewById(R.id.tv_category);
            sPrice = itemView.findViewById(R.id.tv_price);
            iImage = itemView.findViewById(R.id.veg_image);
        }
    }
}
