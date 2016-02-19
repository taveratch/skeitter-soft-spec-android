package com.example.taweesoft.skeitter;

import com.example.taweesoft.skeitter.Service.APIService;

import java.io.IOException;
import java.util.List;

import retrofit.Call;

/**
 * Created by TAWEESOFT on 2/18/16 AD.
 */
public class Database {

    public List<Tweet> loadTweets() throws IOException {
        APIService service = APIServiceFactory.getInstance();
        Call<List<Tweet>> data = service.loadTweet();

        /*Call synchronously*/
        return data.execute().body();
    }

}
