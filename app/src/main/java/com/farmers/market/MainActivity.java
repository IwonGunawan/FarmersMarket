package com.farmers.market;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import com.farmers.market.utils.VegetableData;
import com.farmers.market.utils.VegetableModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView rvMain;
    public ArrayList<VegetableModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(" Farmers Market");
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//            getSupportActionBar().setIcon(R.drawable.ic_action_name);
        }

        rvMain = findViewById(R.id.rv_main);
        rvMain.setHasFixedSize(true);

        list.addAll(VegetableData.listData());
        showRecyclerList();
    }


    public void showRecyclerList() {
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter mainAdapter = new MainAdapter(list);
        rvMain.setAdapter(mainAdapter);
    }
}
