package com.example.giwangnuelsyaputri.joox.Presenter;

import android.content.Context;

import com.example.giwangnuelsyaputri.joox.Model.ArtistModel;
import com.example.giwangnuelsyaputri.joox.R;
import com.example.giwangnuelsyaputri.joox.View.MainView;

import java.util.ArrayList;
import java.util.List;

public class ArtistPresenter {
    Context context;
    List<ArtistModel> artistModels = new ArrayList<>();
    MainView view;

    public ArtistPresenter(Context context, MainView view) {
        this.context = context;
        this.view = view;
    }

    public void setData() {
        ArtistModel playlist;
        playlist = new ArtistModel("Billie", R.drawable.billie);
        artistModels.add(playlist);
        playlist = new ArtistModel("NIKI", R.drawable.niki);
        artistModels.add(playlist);
        playlist = new ArtistModel("Rex Orange County", R.drawable.rex);
        artistModels.add(playlist);
        playlist = new ArtistModel("Blackpink", R.drawable.blackpink);
        artistModels.add(playlist);
        view.onSucsess(artistModels);
    }

}
