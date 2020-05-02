package com.example.flickrapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity implements GetFlickrJavaObjects.IDisplayPhoto {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        new GetFlickrJavaObjects("Android, lollipop", true, this);
    }

    @Override
    public void displayPhoto(List<Photo> photoList) {

        FlickRecyclerViewAdapter flickRecyclerViewAdapter = new FlickRecyclerViewAdapter(this, photoList);
        mRecyclerView.setAdapter(flickRecyclerViewAdapter);
    }
}
