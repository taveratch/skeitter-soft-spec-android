package com.example.taweesoft.skeitter.Service;

import com.example.taweesoft.skeitter.Tweet;
import com.squareup.okhttp.ResponseBody;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by TAWEESOFT on 2/18/16 AD.
 */
public interface APIService {

    @GET("api/v1/tweets")
    Call<List<Tweet>> loadTweet();
}
