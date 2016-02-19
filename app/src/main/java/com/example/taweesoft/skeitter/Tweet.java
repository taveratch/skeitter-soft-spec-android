package com.example.taweesoft.skeitter;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TAWEESOFT on 2/18/16 AD.
 */
public class Tweet {
    @SerializedName("id")
    private int id;

    @SerializedName("text")
    private String text;

    @Override
    public String toString() {
        return id +  " " + text;
    }


    @SerializedName("created_at")
    private String created_at;

    @SerializedName("user")
    private User user;

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getCreated_at() {
        return created_at;
    }

    public User getUser() {
        return user;
    }
}
