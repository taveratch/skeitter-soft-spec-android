package com.example.taweesoft.skeitter;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.taweesoft.skeitter.Service.APIService;
import com.example.taweesoft.skeitter.Service.RegisterActivity;

import java.io.IOException;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class LoginActivity extends AppCompatActivity implements Observer{

    /*Define UI components*/
    @Bind(R.id.username_txt)
    TextView username_txt;

    @Bind(R.id.password_txt)
    TextView password_txt;

    @Bind(R.id.login_btn)
    Button login_btn;

    @Bind(R.id.register_txt)
    TextView register_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setAction();


    }

    @Override
    public void update(Observable observable, Object data) {
        List<Tweet> tweets = (List<Tweet>)data;
        for(Tweet tweet : tweets)
            Log.e("Tweet" , tweet.toString());
    }

    /**
     * Set actions to the components
     */
    public void setAction(){
        login_btn.setOnClickListener(new Login());
        register_txt.setOnClickListener(new Register());
    }

    /**
     * Login class
     */
    class Login implements View.OnClickListener{
        @Override
        public void onClick(View v) {

            /* todo
            * Implement login command.
            * */



            Intent intent = new Intent(LoginActivity.this,TweetActivity.class);
            startActivity(intent);
        }
    }

    /**
     * Go to register activity.
     */
    class Register implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        }
    }
}
