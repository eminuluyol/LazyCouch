package com.example.android.lazycouch.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.android.lazycouch.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Emin on 10/30/2015.
 */
public class MovieGridViewAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<String> imageUrls;

    public MovieGridViewAdapter(Context context, List<String> imageUrls){
        //super(context, R.layout.grid_view_item, imageUrls);

        this.context = context;
        this.imageUrls = imageUrls;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return imageUrls.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView == null){
            convertView = inflater.inflate(R.layout.grid_view_item, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_view_movie);
        Picasso.with(context).load(imageUrls.get(position)).fit().into(imageView);

        return convertView;
    }
}
