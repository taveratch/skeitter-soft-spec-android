package com.example.taweesoft.skeitter;

import android.os.AsyncTask;

import java.io.IOException;
import java.util.List;
import java.util.Observable;

/**
 * Created by TAWEESOFT on 2/18/16 AD.
 */
public class LoadData extends Observable{

    public void loadTweets(){
        final Database database = new Database();
        AsyncTask<Void,Void,List<Tweet>> task = new AsyncTask<Void, Void, List<Tweet>>() {
            @Override
            protected List<Tweet> doInBackground(Void... params) {
                try {
                    return database.loadTweets();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(List<Tweet> tweets) {
                setChanged();
                notifyObservers(tweets);
            }
        };
        task.execute();
    }
}
