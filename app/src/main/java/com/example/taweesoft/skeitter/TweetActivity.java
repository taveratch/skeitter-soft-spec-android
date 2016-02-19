package com.example.taweesoft.skeitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TweetActivity extends AppCompatActivity implements Observer{

    @Bind(R.id.listView)
    ListView tweetList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet);
        ButterKnife.bind(this);
        LoadData loadData = new LoadData();
        loadData.addObserver(this);
        loadData.loadTweets();
    }

    @Override
    public void update(Observable observable, Object data) {
        List<Tweet> tweets = (List<Tweet>)data;
        TweetCustomAdapter adapter = new TweetCustomAdapter(this,tweets);
        tweetList.setAdapter(adapter);
    }
}
