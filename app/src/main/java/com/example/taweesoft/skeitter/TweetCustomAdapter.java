package com.example.taweesoft.skeitter;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by TAWEESOFT on 2/18/16 AD.
 */
public class TweetCustomAdapter extends ArrayAdapter<Tweet> {

    public TweetCustomAdapter(Context context , List<Tweet> tweetList){
        super(context , 0 , tweetList);
    }

//    @Bind(R.id.shortName_txt)
//    TextView shortName;
//
//    @Bind(R.id.username_txt)
//    TextView username_txt;
//
//    @Bind(R.id.message_txt)
//    TextView message_txt;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tweet_custom_view,null);
//            ButterKnife.bind(getContext(), convertView);
            String username = getItem(position).getUser().getName();
            String message = getItem(position).getText();
            TextView shortName = (TextView)convertView.findViewById(R.id.shortName_txt);
            TextView username_txt = (TextView)convertView.findViewById(R.id.username_txt);
            TextView message_txt = (TextView)convertView.findViewById(R.id.message_txt);
            shortName.setText(username.substring(0,1));
            shortName.setBackgroundColor(Color.parseColor(getItem(position).getUser().getColor()));
            username_txt.setText(username);
            message_txt.setText(message);
        }
        return convertView;
    }
}
