package com.farmers.market;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
        }

        rvMain = findViewById(R.id.rv_main);
        rvMain.setHasFixedSize(true);

        list.addAll(VegetableData.listData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        showProfile();
        return super.onOptionsItemSelected(item);
    }

    public void showRecyclerList() {
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter mainAdapter = new MainAdapter(list);
        rvMain.setAdapter(mainAdapter);
    }

    public void showProfile() {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
