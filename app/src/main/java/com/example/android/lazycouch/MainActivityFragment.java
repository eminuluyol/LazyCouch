package com.example.android.lazycouch;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.lazycouch.Adapter.MovieGridViewAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private GridView mGridView;
    private MovieGridViewAdapter mMovieAdapter;


    public MainActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add this line in order for this fragment to handle menu events.
        setHasOptionsMenu(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         String[] movieArray={
                 "http://image.tmdb.org/t/p/w185//nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg"
        };

        List<String> movieList =new ArrayList<String>(Arrays.asList(movieArray));

        View rootView= inflater.inflate(R.layout.fragment_main, container, false);
        mGridView = (GridView) rootView.findViewById(R.id.grid_view_movie);
        mMovieAdapter = new MovieGridViewAdapter(getActivity(), movieList);

        mGridView.setAdapter(mMovieAdapter);


        return rootView;
    }
}
