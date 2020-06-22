package com.farmers.market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.farmers.market.utils.VegetableData;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    TextView tvSku,
            tvName,
            tvStock,
            tvCategory,
            tvPrice,
            tvDesc;
    ImageView detailImage,
            imageSmall1,
            imageSmall2,
            imageSmall3,
            imageSmall4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int vKey = getIntent().getIntExtra("vKey", 0);
        String vName = getIntent().getStringExtra("vName");

        getSupportActionBar().setTitle(vName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        initData();
        setData(vKey);
    }

    private void initData() {
        tvSku = findViewById(R.id.tv_sku);
        tvName = findViewById(R.id.tv_name);
        tvStock = findViewById(R.id.tv_stock);
        tvCategory = findViewById(R.id.tv_category);
        tvPrice = findViewById(R.id.tv_price);
        tvDesc = findViewById(R.id.tv_desc);
        detailImage = findViewById(R.id.detail_image);
        imageSmall1 = findViewById(R.id.image_small1);
        imageSmall2 = findViewById(R.id.image_small2);
        imageSmall3 = findViewById(R.id.image_small3);
        imageSmall4 = findViewById(R.id.image_small4);
    }

    private void setData(int vKey) {
        ArrayList data = VegetableData.detailData(vKey);

        String rSku     = (String) data.get(0);
        String rName    = (String) data.get(1);
        int rStock      = (int) data.get(2);
        String rCategory = (String) data.get(3);
        String rPrice   = (String) data.get(4);
        String rDesc    = (String) data.get(5);
        int rImage      = (int) data.get(6);
        int rImageSmall1    = (int) data.get(7);
        int rImageSmall2    = (int) data.get(8);
        int rImageSmall3    = (int) data.get(9);
        int rImageSmall4    = (int) data.get(10);



        tvSku.setText(rSku);
        tvName.setText(rName);
        tvStock.setText("" + rStock);
        tvCategory.setText(rCategory);
        tvPrice.setText(rPrice);
        tvDesc.setText(rDesc);
        detailImage.setImageResource(rImage);
        imageSmall1.setImageResource(rImageSmall1);
        imageSmall2.setImageResource(rImageSmall2);
        imageSmall3.setImageResource(rImageSmall3);
        imageSmall4.setImageResource(rImageSmall4);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
