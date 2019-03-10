package com.example.giwangnuelsyaputri.joox.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.giwangnuelsyaputri.joox.Adapter.ArtistAdapter;
import com.example.giwangnuelsyaputri.joox.Model.ArtistModel;
import com.example.giwangnuelsyaputri.joox.Presenter.ArtistPresenter;
import com.example.giwangnuelsyaputri.joox.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView rvhorizontal,rvvertikal,rvgrid;
    ArtistAdapter adapter;
    ArtistPresenter data;
    List<ArtistModel> artistModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvhorizontal = findViewById(R.id.rvh);
        rvvertikal = findViewById(R.id.rvv);
        rvgrid = findViewById(R.id.rvg);

        rvhorizontal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        adapter = new ArtistAdapter(this,artistModels);
        rvhorizontal.setAdapter(adapter);
        data = new ArtistPresenter(this,this);
        data.setData();

        rvvertikal.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ArtistAdapter(this,artistModels);
        rvvertikal.setAdapter(adapter);
        data = new ArtistPresenter(this,this);
        data.setData();

        rvgrid.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        adapter = new ArtistAdapter(this,artistModels);
        rvgrid.setAdapter(adapter);
        data = new ArtistPresenter(this,this);
        data.setData();

    }

    @Override
    public void onSucsess(List<ArtistModel> artistModels) {
        this.artistModels.clear();
        this.artistModels.addAll(artistModels);
        this.adapter.notifyDataSetChanged();
    }
}