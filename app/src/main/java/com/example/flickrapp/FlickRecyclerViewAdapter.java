package com.example.flickrapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FlickRecyclerViewAdapter extends RecyclerView.Adapter<FlickRecyclerViewAdapter.FlickImageViewHolder> {

    private Context mContext;
    private List<Photo> mPhotoList;

    public FlickRecyclerViewAdapter(Context context, List<Photo> photoList) {
        mContext = context;
        mPhotoList = photoList;
    }

    @Override
    public int getItemCount() {
        return mPhotoList.size();
    }

    @Override
    public FlickImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_element, null);
        FlickImageViewHolder flickImageViewHolder = new FlickImageViewHolder(v);
        return flickImageViewHolder;
    }

    @Override
    public void onBindViewHolder(FlickImageViewHolder holder, int position) {
        Photo photo = mPhotoList.get(position);
        holder.title.setText(photo.getTitle());

        Picasso.get().load(photo.getImageUrl())
                .error(R.drawable.placeholder)
                .placeholder(R.drawable.placeholder)
                .into(holder.thumbnail);
    }

    class FlickImageViewHolder extends RecyclerView.ViewHolder {

        private ImageView thumbnail;
        private TextView title;

        public FlickImageViewHolder(View itemView) {
            super(itemView);
            thumbnail = (ImageView)itemView.findViewById(R.id.thumbnail);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
